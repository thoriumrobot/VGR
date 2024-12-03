package com.vgr;

import com.vgr.models.CodeSnippet;
import com.vgr.models.RefactorSuggestion;

import java.util.ArrayList;
import java.util.List;

public class RefactoringLibrary {

    public List<RefactorSuggestion> getSuggestions(CodeSnippet codeSnippet) {
        List<RefactorSuggestion> suggestions = new ArrayList<>();
        suggestions.add(new NullSafetyRefactorer().handleNullCheck("handlerMethod"));
        suggestions.add(new NullSafetyRefactorer().handleNullCheck("properties"));
        suggestions.add(new NullSafetyRefactorer().handleNullCheck("resourceLoader"));
        suggestions.add(new NullSafetyRefactorer().handleNullCheck("connectionFactory"));
        suggestions.add(new NullSafetyRefactorer().handleNullCheck("rawValue"));
        return suggestions;
    }
}

