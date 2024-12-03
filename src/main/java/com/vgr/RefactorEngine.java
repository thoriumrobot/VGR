package com.vgr;

import com.vgr.models.CodeSnippet;
import com.vgr.models.RefactorResult;
import com.vgr.models.RefactorSuggestion;

public class RefactorEngine {

    public RefactorResult process(CodeSnippet codeSnippet) {
        Verifier verifier = new Verifier();
        RefactoringLibrary refactoringLibrary = new RefactoringLibrary();

        for (RefactorSuggestion suggestion : refactoringLibrary.getSuggestions(codeSnippet)) {
            CodeSnippet refactoredCode = suggestion.apply(codeSnippet);
            if (!verifier.hasWarnings(refactoredCode)) {
                return new RefactorResult(refactoredCode, true);
            }
        }
        return new RefactorResult(codeSnippet, false); // No refactoring applied successfully
    }
}

