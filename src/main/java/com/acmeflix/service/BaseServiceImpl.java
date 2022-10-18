package com.acmeflix.service;

import com.acmeflix.base.BaseComponent;
import com.acmeflix.domain.BaseModel;
import com.acmeflix.repository.BaseRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T, Long> {

    public abstract BaseRepository<T, Long> getRepository();

    @Override
    public T create(final T entity) {
        final T savedEntity = getRepository().create(entity);
        logger.debug("Created Entity with id:{}", savedEntity.getId());
        return savedEntity;
    }

    @Override
    public List<T> createAll(final T... entities) {
        return createAll(Arrays.asList(entities));
    }

    @Override
    public List<T> createAll(final List<T> entities) {
        final List<T> updatedEntities = new ArrayList<>();
        for (final T entity : entities) {
            updatedEntities.add(create(entity));
        }

        return updatedEntities;
    }

    @Override
    public void update(final T entity) {
        getRepository().update(entity);
        logger.trace("Updated Entity  {},", entity);


    }

    @Override
    public void delete(final T entity) {
        getRepository().delete(entity);
        logger.trace("Deleted  {},", entity);


    }

    @Override
    public void deleteById(final Long id) {

        logger.trace("Entity Deleted");
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(final T entity) {
        boolean exists = getRepository().exists(entity);
        logger.trace("Checking whether {} exists.", entity);
        return exists;
    }

    @Override
    public T get(Long id) {
        logger.trace("Retrieving Entity with id {}.", id);
        T entity = getRepository().get(id);
        return entity;
    }

    @Override
    public List<T> findAll() {
        List<T> entitiesFound = getRepository().findAll();
        logger.trace("Retrieving all entities");
        return entitiesFound;
    }
}
