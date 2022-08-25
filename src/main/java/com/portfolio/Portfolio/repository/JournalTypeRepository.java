
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.JournalType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalTypeRepository extends JpaRepository <JournalType, Long>{
    //@Query("SELECT jt FROM JOURNALTYPE jt WHERE jt.personId = :personId")
	//public List<JournalType> getJournalTypeByPersonId(@Param("personId") Long personId );
}
