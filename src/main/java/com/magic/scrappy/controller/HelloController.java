package com.magic.scrappy.controller;

import com.magic.scrappy.annotation.RateLimiter;
import com.magic.scrappy.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    /**
     * 限流，10 秒之内，这个接口可以访问 3 次
     */
    @RateLimiter(time = 10, count = 3,limitType = LimitType.IP)
    public String hello() {
        return "hello";
    }
}