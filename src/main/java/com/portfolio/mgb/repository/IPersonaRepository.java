package com.portfolio.mgb.repository;

import com.portfolio.mgb.entity.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<persona,Long> {
    
}
