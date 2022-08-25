
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Proyect;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository <Proyect, Long> {
    @Query("SELECT p FROM PROYECT p WHERE p.personId = :personId")
	public List<Proyect> getProyectByPersonId(@Param("personId") Long personId );
}
