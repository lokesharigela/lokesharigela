package com.example.catalogservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@FeignClient("image-service")
public interface ImageRestClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/images", consumes = "application/json")
    Collection<String> getImageNames();
}
