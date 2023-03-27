package com.store.shopmanager.models;

import java.util.List;

import com.store.shopmanager.models.base.BaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Categoria extends BaseModel {
    @Column
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
