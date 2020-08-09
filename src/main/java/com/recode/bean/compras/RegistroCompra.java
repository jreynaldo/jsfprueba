package com.recode.bean.compras;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


public final class RegistroCompra {
    private  String id;
    private  String fechaFactura;
    private  Long nitProveedor;

    private  Long numeroFactura;
    private  String codigoAutorizacion;
    private  BigDecimal importeBaseCf;
    private  String codigoControl;
    private  Long usuarioRegistro;
    private  String nombreCliente;
    private  String tipoDocumentoCliente;
    private  String numeroDocumentoCliente;
    private  String complementoDocumentoCliente;
    private  String origenId;


    public RegistroCompra() {
    }

    public RegistroCompra(String id,
                          String fechaFactura,
                          Long nitProveedor,
                          Long numeroFactura,
                          String codigoAutorizacion,
                          BigDecimal importeBaseCf,
                          String codigoControl,
                          Long usuarioRegistro,
                          String nombreCliente,
                          String tipoDocumentoCliente,
                          String numeroDocumentoCliente,
                          String complementoDocumentoCliente,
                          String origenId) {
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

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }



    public void setFechaFactura(String fechaFactura) {

      this.fechaFactura = fechaFactura;
    }
    public Long getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(Long nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public BigDecimal getImporteBaseCf() {
        return importeBaseCf;
    }

    public void setImporteBaseCf(BigDecimal importeBaseCf) {
        this.importeBaseCf = importeBaseCf;
    }

    public String getCodigoControl() {
        return codigoControl;
    }

    public void setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }

    public Long getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Long usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    public String getComplementoDocumentoCliente() {
        return complementoDocumentoCliente;
    }

    public void setComplementoDocumentoCliente(String complementoDocumentoCliente) {
        this.complementoDocumentoCliente = complementoDocumentoCliente;
    }

    public String getOrigenId() {
        return origenId;
    }

    public void setOrigenId(String origenId) {
        this.origenId = origenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroCompra that = (RegistroCompra) o;
        return id.equals(that.id) &&
                fechaFactura.equals(that.fechaFactura) &&
                nitProveedor.equals(that.nitProveedor) &&
                numeroFactura.equals(that.numeroFactura) &&
                codigoAutorizacion.equals(that.codigoAutorizacion) &&
                importeBaseCf.equals(that.importeBaseCf) &&
                codigoControl.equals(that.codigoControl) &&
                usuarioRegistro.equals(that.usuarioRegistro) &&
                nombreCliente.equals(that.nombreCliente) &&
                tipoDocumentoCliente.equals(that.tipoDocumentoCliente) &&
                numeroDocumentoCliente.equals(that.numeroDocumentoCliente) &&
                complementoDocumentoCliente.equals(that.complementoDocumentoCliente) &&
                origenId.equals(that.origenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaFactura, nitProveedor, numeroFactura, codigoAutorizacion, importeBaseCf, codigoControl, usuarioRegistro, nombreCliente, tipoDocumentoCliente, numeroDocumentoCliente, complementoDocumentoCliente, origenId);
    }
}
