package com.example.service.impl;

import com.example.service.TemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TemplateServiceImpl implements TemplateService {
    @Override
    public void demo(Long id) {
        log.info("调用demo方法，参数为：" + id);
    }
}
