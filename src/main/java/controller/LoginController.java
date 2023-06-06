package controller;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.Account;
import service.AccountService;
import utils.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    AccountService accountService;

    @Autowired
    private HttpServletRequest request;

    @PostMapping("register")
    public String register(@RequestBody Account account){
        boolean flag=accountService.checkUserName(account);
        if(flag){

            return JSONArray.fromObject(Result.error(-1,"账号重复")).toString();
        }
        String id= UUID.randomUUID().toString();
        account.setAccountId(id);
        accountService.addAccount(account);
        return JSONArray.fromObject(Result.success("账号注册成功")).toString();
    }

//    @GetMapping("test")
//    public String getTest(String userName){
//
//    }
}
