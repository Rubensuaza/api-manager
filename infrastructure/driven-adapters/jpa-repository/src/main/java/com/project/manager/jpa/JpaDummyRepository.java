package com.project.manager.jpa;

import com.project.manager.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDummyRepository extends JpaRepository<DummyEntity, Integer> {
}
