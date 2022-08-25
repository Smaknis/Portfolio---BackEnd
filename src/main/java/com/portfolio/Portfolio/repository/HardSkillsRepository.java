
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.HardSkills;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillsRepository extends JpaRepository <HardSkills, Long>{
    @Query("SELECT h FROM HARDSKILLS h WHERE h.personId = :personId")
	public List<HardSkills> getHardSkillsByPersonId(@Param("personId") Long personId );
}
