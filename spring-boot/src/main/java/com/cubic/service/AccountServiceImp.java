package com.cubic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.controller.AccountDTO;
import com.cubic.controller.SignupDTO;
import com.cubic.dao.AccountRepo;
import com.cubic.dao.entity.AccountEntity;
import com.cubic.dao.entity.SignupEntity;

@Service
public class AccountServiceImp implements AccountService{
	
	@Autowired
	private AccountRepo acc;
	
	@Override
	public void save(AccountDTO accDto) {
			AccountEntity account = new AccountEntity();
			BeanUtils.copyProperties(accDto, account);
			account.setDate(new Date());
			acc.save(account);
			
			
		
	}

	@Override
	public List<AccountDTO> findAll() {
		List<AccountEntity> accounts= acc.findAll();
		List<AccountDTO> dtos = new ArrayList<>();
		for (AccountEntity acc : accounts) {
			AccountDTO dto = new AccountDTO();
			BeanUtils.copyProperties(acc, dto);
			dtos.add(dto);
		}
		
		
		return dtos; 
	}
	
}
