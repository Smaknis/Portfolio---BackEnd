
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.JobLocation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobLocationRepository extends JpaRepository <JobLocation, Long>{
    //@Query("SELECT jl FROM JOBLOCATION jl WHERE jl.personId = :personId")
	//public List<JobLocation> getJobLocationByPersonId(@Param("personId") Long personId );
}
