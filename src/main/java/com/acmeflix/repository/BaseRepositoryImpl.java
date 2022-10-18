package com.acmeflix.repository;

import com.acmeflix.base.BaseComponent;
import com.acmeflix.domain.BaseModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class BaseRepositoryImpl<T extends BaseModel> extends BaseComponent implements BaseRepository<T, Long> {

    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean exists(T entity) {
        return false;
    }

    @Override
    public T get(Long id) {
        return null;
    }
}
