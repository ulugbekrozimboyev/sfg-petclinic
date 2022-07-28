package guru.spring.sfgpetclinic.controllers;


import guru.spring.sfgpetclinic.models.Owner;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = {WebApplicationContext.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OwnerControllerTest {

    private RestTemplate restTemplate = new RestTemplate();

    @LocalServerPort
    protected int port;

    private String getEventServiceHost() {
        return "http://localhost:" + port;
    }

    private ResponseEntity<Set<Owner>> responseEntity;

    @Test
    @ParameterizedTest
    @ValueSource(strings = "/owners/json")
    public void getAllOwnerTest(String url){
        HttpEntity<Owner> request = new HttpEntity<>(new Owner());
        responseEntity = restTemplate
                .exchange(getEventServiceHost() + url,
                        HttpMethod.GET,
                        request,
                        new ParameterizedTypeReference<Set<Owner>>() {}
                );
        assertEquals(2, responseEntity.getBody().size());
    }

}