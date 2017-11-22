package com.someok.restdocs.operation.preprocess;

import org.springframework.restdocs.operation.OperationRequest;
import org.springframework.restdocs.operation.OperationRequestFactory;
import org.springframework.restdocs.operation.OperationRequestPart;
import org.springframework.restdocs.operation.OperationRequestPartFactory;
import org.springframework.restdocs.operation.preprocess.OperationPreprocessorAdapter;
import org.springframework.util.CollectionUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 替代附件为 mock 文本，否则输出内容太多，导致生成的 html 无法正常显示。
 *
 * Create Time: 2017-10-30 23:46
 *
 * @author wjx
 * @version 1.0.0
 */
class RequestPartsModifyingOperationPreprocessor extends OperationPreprocessorAdapter {

    /**
     * 替换后的 mock 文本内容
     */
    private static final byte[] MOCK_PART_CONTENT = "<binary>".getBytes(StandardCharsets.UTF_8);

    private final OperationRequestFactory requestFactory = new OperationRequestFactory();

    private final OperationRequestPartFactory requestPartFactory = new
        OperationRequestPartFactory();

    @Override
    public OperationRequest preprocess(OperationRequest request) {
        Collection<OperationRequestPart> parts = request.getParts();
        if (CollectionUtils.isEmpty(parts)) {
            return request;
        }

        List<OperationRequestPart> newParts = new ArrayList<>(parts.size());
        OperationRequestPart part;
        for (OperationRequestPart requestPart : parts) {
            // 如果附件内容不多，则直接输出，否则用 mock 信息替代
            if (requestPart.getContent().length > 20) {

                part = requestPartFactory
                    .create(requestPart.getName(), requestPart.getSubmittedFileName(),
                        MOCK_PART_CONTENT, requestPart.getHeaders());
            } else {
                part = requestPart;
            }

            newParts.add(part);
        }

        return this.requestFactory
            .create(request.getUri(), request.getMethod(), request.getContent(),
                request.getHeaders(), request.getParameters(), newParts, request.getCookies());
    }
}
