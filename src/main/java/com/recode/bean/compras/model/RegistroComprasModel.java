package com.recode.bean.compras.model;

import com.recode.bean.compras.RegistroCompra;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "registroComprasModel")
@ViewScoped
public final class RegistroComprasModel {
    private List<RegistroCompra> facturas = new ArrayList<>();
}
