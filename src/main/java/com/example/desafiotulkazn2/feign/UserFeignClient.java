package com.example.desafiotulkazn2.feign;

import com.example.desafiotulkazn2.configuration.FeignClientConfig;
import com.example.desafiotulkazn2.entity.Activity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * UserFeignClient.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@FeignClient(name = "ACTIVITY-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {


    /**
     * Metodo que realiza una peticion path variable tipo get
     * y retorna un json de activity
     *
     * @return {@link Activity}
     */


    @GetMapping(value = "/activity?type={type}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Activity saveActivityType(@PathVariable("type")String type);




}
