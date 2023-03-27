package com.store.shopmanager.services.base;

import java.util.List;
import java.util.Optional;

import com.store.shopmanager.models.base.BaseModel;

public interface GenericService<T extends BaseModel> {
    public List<T> getAll();

    public Optional<T> getById(Long id);

    public T save(T entity);

    public void deleteById(Long id);
}
