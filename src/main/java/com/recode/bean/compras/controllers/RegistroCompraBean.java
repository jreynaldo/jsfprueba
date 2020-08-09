package com.recode.bean.compras.controllers;

import com.recode.bean.compras.RegistroCompra;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ManagedBean
@RequestScoped
public final class RegistroCompraBean {
    private RegistroCompra registroCompra = new RegistroCompra();
    private static List<RegistroCompra> registroCompras = new ArrayList<>();
    private static List<Long> nitList = new ArrayList<>();

    public RegistroCompraBean() {

            RegistroCompra registroCompra = new RegistroCompra();
            registroCompras.add(registroCompra);

        if (nitList.size() == 0){
            nitList.add(56L);
            nitList.add(66L);
            nitList.add(77L);
        }

    }

    public  List<Long> getNitList() {
        return nitList;
    }

    public  void setNitList(List<Long> nitList) {
        this.nitList = nitList;
    }

    public  void agregarRegistroCompra(RegistroCompra registroCompra){
        registroCompra.setId(UUID.randomUUID().toString());
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

    public void modificarCompa(RegistroCompra registroCompra) {

        if ( registroCompra.getId() != null){

            RegistroCompra registroCompraOld = registroCompras.stream().filter(x -> x.getId().equals(registroCompra.getId())).findFirst().orElse(null);
            int index = registroCompras.indexOf(registroCompraOld);
            registroCompras.remove(index);
            registroCompras.add(index,registroCompra);
            return;
        }
        registroCompras.remove(registroCompras.size()-1);
        registroCompra.setId( UUID.randomUUID().toString());

        registroCompras.add(registroCompra);
        registroCompras.add(new RegistroCompra());


       updateList(registroCompra.getNitProveedor());

    }

    public void saveOrUpdate(RegistroCompra registroCompra) {
        RegistroCompra registroCompraOld = registroCompras.stream().filter(x -> x.getId().equals(registroCompra.getId())).findFirst().orElse(registroCompra);


    }
    public void updateList(Long nit){
        if(!this.nitList.stream().filter(x -> x.equals(nit)).findFirst().isPresent()){
            this.nitList.add(nit);
        }
    }
}
