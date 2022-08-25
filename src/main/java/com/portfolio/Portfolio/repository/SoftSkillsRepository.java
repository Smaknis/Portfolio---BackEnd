
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.SoftSkills;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillsRepository extends JpaRepository <SoftSkills, Long>{
    @Query("SELECT s FROM SOFTSKILLS s WHERE s.personId = :personId")
	public List<SoftSkills> getSoftSkillsByPersonId(@Param("personId") Long personId );
}
