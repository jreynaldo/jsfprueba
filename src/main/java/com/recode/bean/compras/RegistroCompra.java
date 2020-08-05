package com.recode.bean.compras;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class RegistroCompra {
    private final String id;
    private final LocalDate fechaFactura;
    private final Long nitProveedor;

    private final Long numeroFactura;
    private final String codigoAutorizacion;
    private final BigDecimal importeBaseCf;
    private final String codigoControl;
    private final Long usuarioRegistro;
    private final String nombreCliente;
    private final String tipoDocumentoCliente;
    private final String numeroDocumentoCliente;
    private final String complementoDocumentoCliente;
    private final String origenId;

    public RegistroCompra() {
        this.id = null;
        this.fechaFactura = null;
        this.nitProveedor = null;
        this.numeroFactura = null;
        this.codigoAutorizacion = null;
        this.importeBaseCf = null;
        this.codigoControl = null;
        this.usuarioRegistro = null;
        this.nombreCliente = null;
        this.tipoDocumentoCliente = null;
        this.numeroDocumentoCliente = null;
        this.complementoDocumentoCliente = null;
        this.origenId = null;
    }

    public RegistroCompra(String id, LocalDate fechaFactura, Long nitProveedor, Long numeroFactura, String codigoAutorizacion, BigDecimal importeBaseCf, String codigoControl, Long usuarioRegistro, String nombreCliente, String tipoDocumentoCliente, String numeroDocumentoCliente, String complementoDocumentoCliente, String origenId) {
        this.id = id;
        this.fechaFactura = fechaFactura;
        this.nitProveedor = nitProveedor;
        this.numeroFactura = numeroFactura;
        this.codigoAutorizacion = codigoAutorizacion;
        this.importeBaseCf = importeBaseCf;
        this.codigoControl = codigoControl;
        this.usuarioRegistro = usuarioRegistro;
        this.nombreCliente = nombreCliente;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.numeroDocumentoCliente = numeroDocumentoCliente;
        this.complementoDocumentoCliente = complementoDocumentoCliente;
        this.origenId = origenId;
    }

    public String getId() {
        return id;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public Long getNitProveedor() {
        return nitProveedor;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public BigDecimal getImporteBaseCf() {
        return importeBaseCf;
    }

    public String getCodigoControl() {
        return codigoControl;
    }

    public Long getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public String getComplementoDocumentoCliente() {
        return complementoDocumentoCliente;
    }

    public String getOrigenId() {
        return origenId;
    }
}
