package edu.projects.creditapplication.repository;

import edu.projects.creditapplication.entity.CreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<CreditEntity, Long> {
}
