package com.recode.bean.compras.controllers;

import com.recode.bean.compras.RegistroCompra;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public final class RegistroCompraBean {
    private RegistroCompra registroCompra = new RegistroCompra();
    private List<RegistroCompra> registroCompras = new ArrayList<>();

    public RegistroCompraBean() {
    }

    public  void agregarRegistroCompra( RegistroCompra registroCompra){
        this.registroCompras.add(registroCompra);
    }

    public RegistroCompra getRegistroCompra() {
        return registroCompra;
    }

    public void setRegistroCompra(RegistroCompra registroCompra) {
        this.registroCompra = registroCompra;
    }

    public List<RegistroCompra> getRegistroCompras() {
        return registroCompras;
    }

    public void setRegistroCompras(List<RegistroCompra> registroCompras) {
        this.registroCompras = registroCompras;
    }
}
