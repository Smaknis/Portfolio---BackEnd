
package com.portfolio.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JournalType {
    
    private Long id;
    private String journal_type;

    public JournalType() {
    }

    public JournalType(Long id, String journal_type) {
        this.id = id;
        this.journal_type = journal_type;
    }
    
    
}
