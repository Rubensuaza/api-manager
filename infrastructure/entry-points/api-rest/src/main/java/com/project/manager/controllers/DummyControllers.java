package com.project.manager.controllers;

import com.project.manager.dtos.DummyRequest;
import com.project.manager.dtos.DummyResponse;
import com.project.manager.ports.inbounds.DummyUseCasePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/dummy")
@AllArgsConstructor
public class DummyControllers {

    private final DummyUseCasePort dummyUseCase;
    @GetMapping("{id}")
    public DummyResponse getDummy(@PathVariable("id") Integer id){
        return DummyResponse.from(dummyUseCase.getById(id));
    }
    @PostMapping
    public DummyResponse createDummy(@RequestBody DummyRequest dummy){
        return getDummy(dummyUseCase.createDummy(dummy.toDummy()));
    }
}
