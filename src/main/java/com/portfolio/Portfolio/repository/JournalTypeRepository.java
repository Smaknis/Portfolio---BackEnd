
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.JournalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalTypeRepository extends JpaRepository <JournalType, Long>{
    
}
