package com.tustar.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


@EnableWebMvc
@Configuration
public class ResponseFormatConfig {

    @RestControllerAdvice()
    public class ResponseDataHandler implements ResponseBodyAdvice<Object> {
        @Override
        public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
            return true;
        }

        @Override
        public Object beforeBodyWrite(Object data, MethodParameter methodParameter, MediaType mediaType,
                                      Class<? extends HttpMessageConverter<?>> aClass,
                                      ServerHttpRequest serverHttpRequest,
                                      ServerHttpResponse serverHttpResponse) {
            if (data instanceof ResponseResult) {
                return data;
            }
            return new ResponseResult<>(data);
        }
    }
}
