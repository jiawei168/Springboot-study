package org.example.database.mapper;

import org.example.database.entity.Teacher;

public interface TeacherMapper {
    Teacher findTeacherById(int teacherId);
}
