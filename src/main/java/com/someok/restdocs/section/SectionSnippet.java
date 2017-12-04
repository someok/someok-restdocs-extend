package com.someok.restdocs.section;

import com.someok.restdocs.payload.ResponseErrorsSnippet;
import org.springframework.restdocs.headers.RequestHeadersSnippet;
import org.springframework.restdocs.operation.Operation;
import org.springframework.restdocs.payload.RequestFieldsSnippet;
import org.springframework.restdocs.payload.ResponseFieldsSnippet;
import org.springframework.restdocs.request.PathParametersSnippet;
import org.springframework.restdocs.request.RequestParametersSnippet;
import org.springframework.restdocs.request.RequestPartsSnippet;
import org.springframework.restdocs.snippet.Snippet;
import org.springframework.restdocs.snippet.TemplatedSnippet;

import java.util.HashMap;
import java.util.Map;

/**
 * 将多个 snppet 合并成一个.
 * <p>
 * 因为多数生成的 adoc 结构都类似，所以为了省事，这儿提供个 section 用于汇总这些 snippet 内容。
 *
 * @author wjx
 * @version 1.0.0
 */
public class SectionSnippet extends TemplatedSnippet {

    private static final String SNIPPET_NAME = "someok-section";

    private Snippet[] snippets;

    public SectionSnippet(Snippet[] snippets) {
        super(SNIPPET_NAME, null);
        this.snippets = snippets;
    }

    @Override
    protected Map<String, Object> createModel(Operation operation) {
        Map<String, Object> model = new HashMap<>();

        if (null == this.snippets || this.snippets.length == 0) {
            return model;
        }

        boolean hasRequestParameters = hasSnippet(RequestParametersSnippet.class);
        boolean hasRequestHeaders = hasSnippet(RequestHeadersSnippet.class);
        boolean hasPathParameters = hasSnippet(PathParametersSnippet.class);
        boolean hasRequestParts = hasSnippet(RequestPartsSnippet.class);
        boolean hasResponseFields = hasSnippet(ResponseFieldsSnippet.class);
        boolean hasRequestFields = hasSnippet(RequestFieldsSnippet.class);
        boolean hasResponseErrors = hasSnippet(ResponseErrorsSnippet.class);

        model.put("hasRequestParameters", hasRequestParameters);
        model.put("hasPathParameters", hasPathParameters);
        model.put("hasRequestHeaders", hasRequestHeaders);
        model.put("hasRequestParts", hasRequestParts);
        model.put("hasResponseFields", hasResponseFields);
        model.put("hasRequestFields", hasRequestFields);
        model.put("hasResponseErrors", hasResponseErrors);

        return model;
    }

    private boolean hasSnippet(Class<? extends Snippet> cls) {
        for (Snippet snippet : snippets) {
            if (snippet.getClass().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
