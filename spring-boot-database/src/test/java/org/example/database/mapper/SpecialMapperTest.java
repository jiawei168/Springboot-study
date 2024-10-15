package org.example.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.database.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class SpecialMapperTest {

    @Resource
    private SpecialMapper specialMapper;
    @Test
    void findAll() {
        List<Special> all = specialMapper.findAll();
        all.forEach(System.out::println);
    }
}