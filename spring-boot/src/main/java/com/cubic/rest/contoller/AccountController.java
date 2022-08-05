package com.cubic.rest.contoller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.controller.AccountDTO;
import com.cubic.controller.MessageResponse;
import com.cubic.service.AccountService;

@RestController
@RequestMapping("/v2")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
	
	
	@Autowired
	private AccountService accService;
	private MessageResponse createMessage(String message) {
		MessageResponse messageResponse=new MessageResponse();
		messageResponse.setCode(1);
		messageResponse.setMessage(message);
		return messageResponse;
	}
	@PostMapping("/accounts")
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponse postSignup(@RequestBody AccountDTO accDto, Principal user) {
		String username=user.getName();
		accDto.setCreatedBy(username);
		accService.save(accDto);
		return createMessage("You have signed up successfully.");
	}
	
	@GetMapping("/accounts")
	public List<AccountDTO> findAll(){
		List<AccountDTO> accounts= accService.findAll();
		return accounts;
		
	}
	
	
	
}
