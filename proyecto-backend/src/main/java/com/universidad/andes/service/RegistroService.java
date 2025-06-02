package com.universidad.andes.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class RegistroService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("📌 Registrando solicitud...");
        // Aquí puedes guardar en base de datos, etc.
    }
}

