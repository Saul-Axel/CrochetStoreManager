package com.store.shopmanager.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.shopmanager.controllers.base.GenericControllerImp;
import com.store.shopmanager.models.Producto;

@RestController
@RequestMapping(path = "/producto")
public class ProductoControllerImp extends GenericControllerImp<Producto> implements ProductoController {

    @Override
    public Producto save(@RequestBody Producto producto) {
        producto.setImagen("imagen");
        return producto;
    }

}
