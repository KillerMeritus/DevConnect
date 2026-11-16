package com.devconnect.DevConnect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {
//    URL GET /health
    @GetMapping("/health")
    public String getHealth(){
        return "Springboot Application running Healthy.";
    }

    @GetMapping("/api/vi/status")
    public Map<String,Object> getStatus(){
        Map<String, Object> map = new HashMap<>();
        map.put("status","OK");
        map.put("Service", "DevConnect8");


        return map;
    }
}
