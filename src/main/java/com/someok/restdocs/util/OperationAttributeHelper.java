package com.someok.restdocs.util;

import org.springframework.restdocs.generate.RestDocumentationGenerator;
import org.springframework.restdocs.operation.Operation;

import java.util.Map;

/**
 * restdocs 的一些常用工具方法。
 *
 * @author wjx
 * @version 1.0.0
 */
public class OperationAttributeHelper {
    private static final String REQUEST_PATTERN = RestDocumentationGenerator
        .ATTRIBUTE_NAME_URL_TEMPLATE;

    public static String getRequestMethod(Operation operation) {
        return operation.getRequest().getMethod().name();
    }

    public static String getRequestPattern(Operation operation) {
        Map<String, Object> attributes = operation.getAttributes();
        return (String) attributes.get(REQUEST_PATTERN);
    }
}
