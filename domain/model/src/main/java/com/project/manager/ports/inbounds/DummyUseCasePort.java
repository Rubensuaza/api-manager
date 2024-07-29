package com.project.manager.ports.inbounds;

import com.project.manager.models.Dummy;

public interface DummyUseCasePort {
    Dummy getById(Integer id);
    Integer createDummy(Dummy dummy);
}
