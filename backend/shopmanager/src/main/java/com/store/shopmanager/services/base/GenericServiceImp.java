package com.store.shopmanager.services.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.store.shopmanager.models.base.BaseModel;
import com.store.shopmanager.repositories.base.GenericRepository;

public class GenericServiceImp<T extends BaseModel> implements GenericService<T> {
    @Autowired
    private GenericRepository<T> repository;

    @Override
    public List<T> getAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
