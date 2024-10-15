package org.example.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseStudent {
    @TableId(value = "id",type= IdType.AUTO)
    private int id;
    private int studentId;
    private int courseId;
}
