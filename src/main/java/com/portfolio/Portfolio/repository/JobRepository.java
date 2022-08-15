
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <Job, Long>{
    
}
