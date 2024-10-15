package org.example.database.mapper;


import org.apache.ibatis.annotations.Param;
import org.example.database.entity.Student;


import java.util.List;

public interface StudentMapper {
    int insert(Student student);
    Student findStudentById(int studentId);
    int updateById(Student student);
    int deleteById(int studentId);
    int batchInsert(@Param("student") List<Student> student);
    int batchDelete(@Param("idList") List<Integer> ids);
    List<Student> selectByDynamicSql(Student student);

    void batchUpdate(List<Student> students);

    Student getStudentManyToOne(int studentId);

    Student getStudent(int studentId);

}
