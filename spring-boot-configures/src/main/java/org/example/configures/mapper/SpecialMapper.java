package org.example.configures.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.configures.entity.Special;

import java.util.List;

/**
 * @author 86184
 */
@Mapper
public interface SpecialMapper {
    @Select("SELECT * FROM list ORDER BY updated DESC")
    List<Special> findAll();
}
