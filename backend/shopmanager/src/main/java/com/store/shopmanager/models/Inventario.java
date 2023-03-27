package com.store.shopmanager.models;

import com.store.shopmanager.models.base.BaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Inventario extends BaseModel {
    @Column
    private String cantidad;

    @Column
    private String ubicacion;

    @OneToOne(mappedBy = "inventario")
    private Producto producto;
}
