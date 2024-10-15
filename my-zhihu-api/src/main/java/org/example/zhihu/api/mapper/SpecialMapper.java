package org.example.zhihu.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.zhihu.api.entity.Special;

import java.util.List;

public interface SpecialMapper {

     List<Special> selectAll() ;
     List<Special> selectByPage(int limit,int offset);
}
