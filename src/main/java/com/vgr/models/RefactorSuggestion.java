package com.vgr.models;

@FunctionalInterface
public interface RefactorSuggestion {
    CodeSnippet apply(CodeSnippet codeSnippet);
}

