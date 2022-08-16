
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Job;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <Job, Long>{
    
   /* @Query("SELECT j FROM Job j WHERE j.personId = :person_id")
    public List<Job> getJobByPersonId(@Param("personId") long personId );*/
    
}
