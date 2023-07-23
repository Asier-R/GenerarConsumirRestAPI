package com.gettingStarted.consumingrest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
	
	@GetMapping("/test")
	public ResponseEntity<Quote> retriveRandomQuoteTest(){
		
		String uri = "http://localhost:8080/api/random";
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject(uri, Quote.class);
		
		if(quote == null) return ResponseEntity.notFound().build();
		else return ResponseEntity.ok(quote);
		
	}
	
	@GetMapping("/random")
	public String retriveRandomQuote(
			@RequestParam(name="cita", required=false, defaultValue="No disponible")
			String cita, Model model){
		
		model.addAttribute("cita",cita);
		
		String uri = "http://localhost:8080/api/random";
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject(uri, Quote.class);
		
		if(quote == null) return "No disponible";
		else return quote.toString();
		
	}
	
	
}