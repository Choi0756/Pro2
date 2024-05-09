package com.lesson.demo3.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class ApiExamSearchBlog {

    public static void main(String[] args) {
        String clientId = "5p623yeafwQ05VfQS6sc"; // 네이버 애플리케이션 클라이언트 아이디
        String clientSecret = "lr26XYhy9W"; // 네이버 애플리케이션 클라이언트 시크릿
        String query = "검색할_키워드"; // 검색할 키워드를 입력하세요

        try {
            String text = URLEncoder.encode(query, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text + "&display=10&start=1&sort=date";

            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상적인 응답일 경우
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else { // 에러 발생 시
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }

            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            System.out.println(response.toString()); // 검색 결과 출력

        } catch (MalformedURLException e) {
            System.err.println("URL 형식이 잘못되었습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("API 요청 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}