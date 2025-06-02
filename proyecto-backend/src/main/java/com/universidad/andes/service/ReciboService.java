package com.universidad.andes.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ReciboService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("💸 Generando recibo de pago...");
        // Aquí puedes generar un código, guardarlo, etc.
        execution.setVariable("codigoRecibo", "REC-12345");
    }
}
