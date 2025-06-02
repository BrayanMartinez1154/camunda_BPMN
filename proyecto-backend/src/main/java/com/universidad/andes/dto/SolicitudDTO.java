package com.universidad.andes.dto;

public class SolicitudDTO {
    private String codigo;
    private String tipoCertificado;
    private String motivo;

    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTipoCertificado() { return tipoCertificado; }
    public void setTipoCertificado(String tipoCertificado) { this.tipoCertificado = tipoCertificado; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
