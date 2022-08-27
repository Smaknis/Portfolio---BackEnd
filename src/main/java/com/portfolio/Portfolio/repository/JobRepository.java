
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Jobs;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <Jobs, Long>{
    
    @Query("SELECT j FROM JOBS j WHERE j.personId = :personId")
    public List<Jobs> getJobByPersonId(@Param("personId") Long personId );
         
}
