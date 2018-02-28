package com.thomsonreuters.company.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by Iana_Kasimova on 28-Feb-18.
 */
public class GetListDocumentsTest {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HttpHeaders headers;

    @Test
    public void testGet1(){
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> response = getRestTemplate().exchange(url, HttpMethod.GET, entity, String.class);
        String responseBody = response.getBody();
    }

}
