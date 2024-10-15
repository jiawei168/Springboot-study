package org.example.zhihu.api.service;

import jakarta.annotation.Resource;
import org.example.zhihu.api.entity.Special;
import org.example.zhihu.api.mapper.SpecialMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpecialServiceTest {
    @Resource
    private SpecialService specialService;

    @Test
    void selectAll(){
        List<Special> specials = specialService.getAll();
        specials.forEach(System.out::println);
    }
}

