package com.universidad.andes.controller;

import com.universidad.andes.dto.SolicitudDTO;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {

    private final RuntimeService runtimeService;

    public SolicitudController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping("/certificado")
    public ResponseEntity<Void> iniciarProceso(@RequestBody SolicitudDTO dto) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("codigo", dto.getCodigo());
        variables.put("tipo_certificado", dto.getTipoCertificado());
        variables.put("motivo", dto.getMotivo());

        runtimeService.startProcessInstanceByKey("solicitud_certificado", variables);
        return ResponseEntity.ok().build();
    }
}
