package com.someok.restdocs.operation.preprocess;

import org.springframework.restdocs.operation.preprocess.OperationPreprocessor;

/**
 * 一些常用的 restdocs 预处理工具。
 *
 * @author wjx
 * @version 1.0.0
 */
public class OperationPreprocessors {

    /**
     * 替代附件为 mock 文本，否则输出内容太多，导致生成的 html 无法正常显示。
     *
     * @return {@link OperationPreprocessor}
     */
    public static OperationPreprocessor replaceBinaryParts() {
        return new RequestPartsModifyingOperationPreprocessor();
    }

}
