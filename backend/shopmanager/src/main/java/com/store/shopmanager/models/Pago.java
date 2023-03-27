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
public class Pago extends BaseModel {
    @Column
    private Double cantidad;

    @Column
    private Double cambio;

    @OneToOne(mappedBy = "pago")
    private Compra compra;
}
