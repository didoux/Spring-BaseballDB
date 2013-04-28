package com.practice.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public abstract class GenericDAO<K, E> {
    private Class<E> entityClass;
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public GenericDAO() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }

    @PersistenceContext(unitName = "baseballPU")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public E persist(E entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void persistAll(List<E> entities) {
        for (E entity : entities) {
            persist(entity);
        }
    }

    public E merge(E entity) {
        return entityManager.merge(entity);
    }

    public void refresh(E entity) {
        entityManager.refresh(entity);
    }

    public E findById(K id) {
        return entityManager.find(entityClass, id);
    }

    public List<E> findById(Collection<K> ids) {
        List<E> entities = new ArrayList<E>(ids.size());
        for (K id : ids) {
            entities.add(findById(id));
        }
        return entities;
    }

    @SuppressWarnings({"unchecked"})
    public List<E> loadAll() {
        Session session = (Session) entityManager.getDelegate();
        Criteria criteria = session.createCriteria(entityClass);
        return (List<E>) criteria.list();
    }

    public E flush(E entity) {
        entityManager.flush();
        return entity;
    }

    public E getReference(K id) {
        return entityManager.getReference(entityClass, id);
    }

    public List<E> getReference(Collection<K> ids) {
        List<E> entities = new ArrayList<E>(ids.size());
        for (K id : ids) {
            entities.add(getReference(id));
        }
        return entities;
    }

    public void deleteById(K id) {
        try {
            E entity = entityManager.getReference(entityClass, id);
            entityManager.remove(entity);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void delete(Collection<E> entities) {
        for (E entity : entities) {
            delete(entity);
        }
    }

    public void delete(E entity) {
        try {
            entityManager.remove(entity);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

}
