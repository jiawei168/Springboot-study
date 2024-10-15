package org.example.database.mapper;

import org.example.database.entity.Clazz;

public interface ClazzMapper {
    Clazz getClazzById(int clazzId);
    Clazz getClazz(int clazzId);
}

