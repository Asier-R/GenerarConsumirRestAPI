package com.gettingStarted.consumingrest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat; 

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ConsumingRestApplicationTests {
	
	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}
	
	//Necesita de la app quoters para funcionar
	@Test
	void shouldReturnQuote() {
		ResponseEntity<Quote> response = restTemplate.getForEntity("/quotes/test", Quote.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
