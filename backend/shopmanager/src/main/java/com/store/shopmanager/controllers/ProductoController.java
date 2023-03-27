package com.store.shopmanager.controllers;

import org.springframework.web.bind.annotation.RequestBody;

import com.store.shopmanager.controllers.base.GenericController;
import com.store.shopmanager.models.Producto;

public interface ProductoController extends GenericController<Producto> {
    @Override
    public Producto save(@RequestBody Producto producto);
}
