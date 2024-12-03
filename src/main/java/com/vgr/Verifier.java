package com.vgr;

import com.vgr.models.CodeSnippet;

public class Verifier {

    public boolean hasWarnings(CodeSnippet codeSnippet) {
        // Simulate verifier warnings
        return codeSnippet.getContent().contains("@Nullable");
    }
}

