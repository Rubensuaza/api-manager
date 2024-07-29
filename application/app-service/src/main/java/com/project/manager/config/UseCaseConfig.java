package com.project.manager.config;

import com.project.manager.ports.inbounds.DummyUseCasePort;
import com.project.manager.ports.outbounds.DummyRepositoryPort;
import com.project.manager.usecases.DummyUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public DummyUseCasePort dummyUseCase(DummyRepositoryPort repositoryPort){
        return new DummyUseCase(repositoryPort);
    }
}
