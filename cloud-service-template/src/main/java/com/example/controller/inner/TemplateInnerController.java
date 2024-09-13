package com.example.controller.inner;


import com.example.common.client.TemplateFeignClient;
import com.example.service.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该服务仅内部调用，不是给前端的，接口对应 FeignClient
 */
@RestController("/inner")
@RequiredArgsConstructor
public class TemplateInnerController implements TemplateFeignClient {

    private final TemplateService templateService;

    @Override
    public void searchById(long id) {
        templateService.demo(id);
    }
}
