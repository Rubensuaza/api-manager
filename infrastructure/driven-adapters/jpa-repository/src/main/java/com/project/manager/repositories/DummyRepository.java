package com.project.manager.repositories;

import com.project.manager.entities.DummyEntity;
import com.project.manager.jpa.JpaDummyRepository;
import com.project.manager.models.Dummy;
import com.project.manager.ports.outbounds.DummyRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class DummyRepository implements DummyRepositoryPort {

    private final JpaDummyRepository repository;
    @Override
    public Dummy findByName(Integer id) {
        return repository
                .findById(id).orElseThrow().toDummy();

    }

    @Override
    public Integer saveDummy(Dummy dummy) {
        return repository.save(DummyEntity.from(dummy)).getId();
    }
}
