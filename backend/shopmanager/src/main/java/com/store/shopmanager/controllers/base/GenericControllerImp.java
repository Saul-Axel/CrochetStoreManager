package com.store.shopmanager.controllers.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.shopmanager.models.base.BaseModel;
import com.store.shopmanager.services.base.GenericService;

@ResponseBody
public class GenericControllerImp<T extends BaseModel> implements GenericController<T> {
    @Autowired
    private GenericService<T> service;

    @GetMapping()
    public List<T> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public T save(@RequestBody T producto) {
        return service.save(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
