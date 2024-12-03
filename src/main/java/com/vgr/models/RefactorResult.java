package com.vgr.models;

public class RefactorResult {
    private final CodeSnippet refactoredCode;
    private final boolean successful;

    public RefactorResult(CodeSnippet refactoredCode, boolean successful) {
        this.refactoredCode = refactoredCode;
        this.successful = successful;
    }

    public CodeSnippet getRefactoredCode() {
        return refactoredCode;
    }

    public boolean isSuccessful() {
        return successful;
    }
}

