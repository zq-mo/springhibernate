package com.bridge.dao;

import org.springframework.stereotype.Repository;

import com.bridge.domain.LoginLog;
@Repository
public interface LoginLogDao {
   void insertLoginLog(LoginLog loginLog);
}