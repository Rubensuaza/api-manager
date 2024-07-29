package com.project.manager.ports.outbounds;

import com.project.manager.models.Dummy;

public interface DummyRepositoryPort {
    Dummy findByName(Integer id);
    Integer saveDummy(Dummy dummy);
}
