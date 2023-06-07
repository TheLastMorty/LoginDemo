package com.han.LoginDemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.han.LoginDemo.pojo.Account;

@Mapper
public interface AccountMapper {
     int addAccount(Account account);
     int updateAccount(Account account);
     Account verifyAccount(Account account);
     Account checkUserName(Account account);
}
