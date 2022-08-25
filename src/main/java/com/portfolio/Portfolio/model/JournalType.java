
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "JOURNALTYPE")
public class JournalType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id_journal;
    
    private String journal_type;

    public JournalType() {
    }

    public JournalType(Long id_journal, String journal_type) {
        this.id_journal = id_journal;
        this.journal_type = journal_type;
    }
 
    
}
