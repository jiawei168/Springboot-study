package org.example.configures.controller;

import jakarta.annotation.Resource;
import org.example.configures.entity.Special;
import org.example.configures.mapper.SpecialMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpecialController {
    @Resource
    private SpecialMapper specialMapper;

    @GetMapping("/specials")
    public List<Special> getSpecials() {
        return  specialMapper.findAll();
    }
}

