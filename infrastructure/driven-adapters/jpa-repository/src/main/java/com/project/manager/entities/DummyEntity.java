package com.project.manager.entities;

import com.project.manager.models.Dummy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name="dummy")
public class DummyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public DummyEntity(String name) {
        this.name = name;
    }

    public Dummy toDummy(){
        return Dummy.builder()
                .id(id)
                .name(name)
                .build();
    }
    public static DummyEntity from(Dummy dummy){
        return new DummyEntity(dummy.getName());
    }
}
