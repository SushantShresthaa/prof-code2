package com.cubic.service;

import java.util.List;

import com.cubic.controller.AccountDTO;

public interface AccountService {
	
	
	public void save(AccountDTO accDto);
	public List<AccountDTO> findAll();
	
}
