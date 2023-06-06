package mapper;

import org.apache.ibatis.annotations.Mapper;
import pojo.Account;

@Mapper
public interface AccountMapper {
     int addAccount(Account account);
     int updateAccount(Account account);
     Account verifyAccount(Account account);
     Account checkUserName(Account account);
}
