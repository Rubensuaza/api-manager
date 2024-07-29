package com.project.manager.usecases;

import com.project.manager.models.Dummy;
import com.project.manager.ports.inbounds.DummyUseCasePort;
import com.project.manager.ports.outbounds.DummyRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DummyUseCase implements DummyUseCasePort {
    private final DummyRepositoryPort repository;
    @Override
    public Dummy getById(Integer id) {
        return repository.findByName(id);
    }

    @Override
    public Integer createDummy(Dummy dummy) {
        return repository.saveDummy(dummy);
    }
}
