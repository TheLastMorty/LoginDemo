package service;

import mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Account;

public class AccountService {
    @Autowired
    AccountMapper  accountMapper;

    public int addAccount(Account account){
        return accountMapper.addAccount(account);
    }

    public int updateAccount(Account account){
        return accountMapper.updateAccount(account);
    }

    public boolean verifyAccount(Account account){
        return accountMapper.verifyAccount(account)==null;
    }

    public boolean checkUserName(Account account){
        return accountMapper.checkUserName(account)==null;
    }

}
