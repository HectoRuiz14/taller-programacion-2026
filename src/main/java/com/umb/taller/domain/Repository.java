package com.umb.taller.domain;

public interface Repository<T, ID> {
    void save(T entity);
    T findById(ID id);
    void delete(ID id);
}