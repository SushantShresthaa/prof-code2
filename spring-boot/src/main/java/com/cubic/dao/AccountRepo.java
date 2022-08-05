package com.cubic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubic.dao.entity.AccountEntity;

public interface AccountRepo extends JpaRepository<AccountEntity, Integer>{

}
