package org.example.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;

import java.util.List;

public interface CourseMapper extends BaseMapper<Course> {

    @Select("SELECT * FROM student WHERE course_id = #{courseId} ")
    List<Student> selectStudentByCourseId(Long courseId);
}
