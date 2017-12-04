package com.someok.restdocs.request;

import org.springframework.restdocs.operation.Operation;
import org.springframework.restdocs.snippet.TemplatedSnippet;

import java.util.HashMap;
import java.util.Map;

import static com.someok.restdocs.util.OperationAttributeHelper.getRequestMethod;
import static com.someok.restdocs.util.OperationAttributeHelper.getRequestPattern;

/**
 * 用于生成请求方法和 URL 路径的 restdocs snippet。
 * <p>
 * 格式为：POST /abc/efg/{id}/hij
 *
 * @author wjx
 * @version 1.0.0
 */
public class MethodAndPathSnippet extends TemplatedSnippet {
    /**
     * 对应 request-method-path.snippet 文件
     */
    private static final String METHOD_PATH = "someok-request-method-path";

    public MethodAndPathSnippet() {
        super(METHOD_PATH, null);
    }

    private static String nullToEmpty(String string) {
        return (string == null) ? "" : string;
    }

    @Override
    protected Map<String, Object> createModel(Operation operation) {
        Map<String, Object> model = new HashMap<>();
        model.put("method", getRequestMethod(operation));
        model.put("path", nullToEmpty(getRequestPattern(operation)));
        return model;
    }

}
