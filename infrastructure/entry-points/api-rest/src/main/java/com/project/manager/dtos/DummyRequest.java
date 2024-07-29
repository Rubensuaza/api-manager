package com.project.manager.dtos;

import com.project.manager.models.Dummy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DummyRequest {
    private String name;

    public Dummy toDummy(){
        return Dummy.builder()
                .name(name)
                .build();
    }
}
