
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.JobUbication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobUbicationRepository extends JpaRepository <JobUbication, Long>{
    
}
