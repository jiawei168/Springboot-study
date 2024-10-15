package org.example.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Student {
    @TableId(value = "id",type= IdType.AUTO)
    private Long id;
    private String name;
    private Long clazzId;
    // ⽤于⼀对多映射
    @TableField(exist = false)
    private List<Course> courses;
}