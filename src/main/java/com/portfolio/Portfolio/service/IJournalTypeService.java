
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JournalType;
import java.util.List;


public interface IJournalTypeService {
    
    public List<JournalType> verJournalType();
    
    public void agregarJournalType (JournalType journal);
    
    public void borrarJournalType (Long id);
    
    public JournalType buscarJournalType (Long id);
     
    public void editarJournalType (JournalType journal);
}
