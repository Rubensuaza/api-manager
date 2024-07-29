package com.project.manager.dtos;

import com.project.manager.models.Dummy;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DummyResponse {
    private Integer id;
    private String name;

    public static DummyResponse from(Dummy dummy){
        return new DummyResponse(
                dummy.getId(),
                dummy.getName()
        );
    }
}
