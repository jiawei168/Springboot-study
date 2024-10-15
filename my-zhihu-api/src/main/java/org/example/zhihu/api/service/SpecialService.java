package org.example.zhihu.api.service;

import org.example.zhihu.api.entity.Special;

import java.util.List;

public interface SpecialService {
    List<Special> getAll();
    List<Special> getByPage(int limit,int offset);
}
