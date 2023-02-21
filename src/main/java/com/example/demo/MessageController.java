package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
@RestController
public class MessageController {
@GetMapping("/check")
public String checkApi() throws JsonProcessingException
{
	Message response=new Message("Hello Welcome to Springboot");
	ObjectMapper ob=new ObjectMapper();
	return ob.writeValueAsString(response);
}
}
