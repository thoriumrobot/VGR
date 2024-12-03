package com.vgr.models;

public class CodeSnippet {
    private final String content;

    public CodeSnippet(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public CodeSnippet withContent(String newContent) {
        return new CodeSnippet(newContent);
    }
}

