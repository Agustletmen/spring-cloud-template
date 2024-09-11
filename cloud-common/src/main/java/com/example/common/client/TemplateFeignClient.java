package com.example.common.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "backend-template-service", path = "/api/template/inner")
public interface TemplateFeignClient {


    @PostMapping("/do")
    void searchById(@RequestParam("id") long id);
}