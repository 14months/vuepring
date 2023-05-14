package com.vuepring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    /**
     * SSR -> jsp, thymeleaf..
     * SPA -> Vue + SSR = nuxt.js Vue 독립으로는 SPA
     *        react + SSR = next
     *
     *        Vue는 자바스크립트가 화면을 만들어주고 서버와의 통신은 api로 진행 (json)
     *
     *        RestController를 사용하는 이유는 json보낼 때 편해서임. Controller로도 가능
     *        코드 까 보면 됨..
     */

    @GetMapping("/posts")
    public String get() {
        return "asdf";
    }




}
