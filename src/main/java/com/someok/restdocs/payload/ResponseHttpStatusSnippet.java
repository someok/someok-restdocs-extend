package com.someok.restdocs.payload;

import org.springframework.restdocs.operation.Operation;
import org.springframework.restdocs.snippet.TemplatedSnippet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wjx
 * @version 1.0.0
 */
public class ResponseHttpStatusSnippet extends TemplatedSnippet {
    private static final String snippet_name = "someok-response-http-statuses";

    private List<HttpStatusDescriptor> descriptors;

    public ResponseHttpStatusSnippet(List<HttpStatusDescriptor> descriptors) {
        super(snippet_name, null);

        this.descriptors = descriptors;
    }

    @Override
    protected Map<String, Object> createModel(Operation operation) {
        Map<String, Object> model = new HashMap<>();
        model.put("httpStatuses", this.descriptors);
        return model;
    }
}
