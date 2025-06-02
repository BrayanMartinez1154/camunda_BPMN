package com.universidad.andes.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CertificadoService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("📄 Emisión del certificado...");
        // Simulación de emisión
    }
}
