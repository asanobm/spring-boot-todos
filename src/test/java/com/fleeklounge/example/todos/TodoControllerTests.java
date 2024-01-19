package com.fleeklounge.example.todos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TodosApplication.class)
public class TodoControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testIndex() {
        String url = "http://localhost:" + port + "/";
        String response = restTemplate.getForObject(url, String.class);
        assert response.equals("Hello, world!");
    }

    @Test
    public void testCreate() {
        String url = "http://localhost:" + port + "/";
        // Test Data JSON {"title":"Test Title","description":"Test Description","done":true}
        String json = "{\"title\":\"Test Title\",\"description\":\"Test Description\",\"done\":true}";
        String response = restTemplate.postForObject(url, json, String.class);
        assert response.equals("Hello, world!");
    }
}
