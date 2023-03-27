package com.store.shopmanager.controllers.base;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.store.shopmanager.models.base.BaseModel;

public interface GenericController<T extends BaseModel> {

    public List<T> getAll();

    public Optional<T> getById(@PathVariable Long id);

    public T save(@RequestBody T producto);

    public void deleteById(@PathVariable("id") Long id);
}
