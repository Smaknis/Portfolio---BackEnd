
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository <Education, Long> {
   /* @Query("SELECT e FROM EXPERIENCIA e WHERE e.personId = :person_id")
	public List<Education> getEducationByPersonId(@Param("personId") long personId );*/
}
