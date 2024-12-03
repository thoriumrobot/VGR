package com.vgr;

import com.vgr.models.CodeSnippet;
import com.vgr.models.RefactorSuggestion;

public class NullSafetyRefactorer {

    public RefactorSuggestion handleNullCheck(String variable) {
        return (code) -> {
            String replacement = "if (" + variable + " != null) {\n" +
                                 "  // Existing logic\n" +
                                 "}";
            return code.replaceAll(variable + ".*", replacement);
        };
    }
}

