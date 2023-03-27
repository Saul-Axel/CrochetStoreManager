package com.store.shopmanager.models;

import java.util.Date;
import java.util.List;

import com.store.shopmanager.models.base.BaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Compra extends BaseModel {
    @Column
    private Date fecha;

    @Column
    private Double total;

    @OneToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;

    @OneToMany(mappedBy = "compra")
    private List<Compra_Productos> compras;
}
