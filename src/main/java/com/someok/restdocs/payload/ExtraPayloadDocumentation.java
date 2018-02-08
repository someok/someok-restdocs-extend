package com.someok.restdocs.payload;

import java.util.List;

/**
 * 扩展 {@link org.springframework.restdocs.payload.PayloadDocumentation}，提供一些自定义的生成 snippet
 * 的方法。
 *
 * @author wjx
 * @version 1.0.0
 */
public class ExtraPayloadDocumentation {
    /**
     * 生成错误列表 adoc.
     *
     * @param errorDescriptors 错误列表
     * @return 错误处理 snippet
     */
    public static ResponseErrorsSnippet responseErrors(List<ErrorDescriptor> errorDescriptors) {
        return new ResponseErrorsSnippet(errorDescriptors);
    }

    /**
     * 生成 http status 列表 adoc。
     *
     * @param descriptors status 列表
     * @return snippet
     */
    public static ResponseHttpStatusSnippet responseHttpStatuses(
        List<HttpStatusDescriptor> descriptors) {
        return new ResponseHttpStatusSnippet(descriptors);
    }
}
