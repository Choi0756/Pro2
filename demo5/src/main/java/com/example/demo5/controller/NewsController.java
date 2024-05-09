package com.example.demo5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final String clientId = "5p623yeafwQ05VfQS6sc";
    private final String clientSecret = "Ir26XYhy9W";

    @GetMapping("/search")
    public String searchNews() {
        String query = "검색할 키워드";
        try {
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            String apiUrl = "https://openapi.naver.com/v1/search/news.json?query=" + encodedQuery + "&display=10&start=1&sort=sim";

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(apiUrl, String.class);

            return result;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "인코딩 오류 발생: " + e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            return "API 요청 중 오류 발생: " + e.getMessage();
        }
    }
}