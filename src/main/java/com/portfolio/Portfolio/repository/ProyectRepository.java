
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository <Proyect, Long>{
    
}
