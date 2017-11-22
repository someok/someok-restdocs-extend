package com.someok.restdocs.payload;

import org.springframework.restdocs.operation.Operation;
import org.springframework.restdocs.snippet.TemplatedSnippet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生成错误信息列表的 snippet。
 * <p>
 * Create Time: 2017-11-01 19:42
 *
 * @author wjx
 * @version 1.0.0
 * @see ErrorDescriptor
 */
public class ResponseErrorsSnippet extends TemplatedSnippet {
    private static final String snippet_name = "response-errors";

    private List<ErrorDescriptor> errorDescriptors;

    ResponseErrorsSnippet(List<ErrorDescriptor> errorDescriptors) {
        super(snippet_name, null);

        this.errorDescriptors = errorDescriptors;
    }

    @Override
    protected Map<String, Object> createModel(Operation operation) {
        Map<String, Object> model = new HashMap<>();
        model.put("errors", this.errorDescriptors);
        return model;
    }
}
