package org.example.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.example.mp.entity.Clazz;
import org.example.mp.entity.Student;
import org.example.mp.entity.Teacher;

import java.util.List;

public interface ClazzMapper extends BaseMapper<Clazz> {
    @Select("SELECT * FROM teacher WHERE id = #{teacherId}")
    Teacher selectTeacherByClazzId(Long teacherId);

    @Select("SELECT * FROM student,teacher WHERE clazz_id = #{clazzId} ")
    List<Student> selectStudentByClazzId(Long clazzId);
}
