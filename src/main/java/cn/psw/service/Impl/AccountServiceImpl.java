package cn.psw.service.Impl;

import cn.psw.dao.AccountDao;
import cn.psw.domain.Account;
import cn.psw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户信息----");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户----");
        accountDao.saveAccount(account);
    }
}
