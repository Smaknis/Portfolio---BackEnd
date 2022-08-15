
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JournalType;
import com.portfolio.Portfolio.repository.JournalTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalTypeService implements IJournalTypeService{
    
    @Autowired
    public JournalTypeRepository journalRepo;
    
    @Override
    public List<JournalType> verJournalType() {
        return journalRepo.findAll();
    }

    @Override
    public void agregarJournalType(JournalType journal) {
        journalRepo.save(journal);
    }

    @Override
    public void borrarJournalType(Long id) {
        journalRepo.deleteById(id);
    }

    @Override
    public JournalType buscarJournalType(Long id) {
        return journalRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJournalType(JournalType journal) {
        journalRepo.save(journal);
    }
}
