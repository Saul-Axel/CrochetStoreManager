package com.store.shopmanager.repositories.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.shopmanager.models.base.BaseModel;

public interface GenericRepository<T extends BaseModel> extends JpaRepository<T, Long> {

}
