package cn.psw.test;

import cn.psw.dao.AccountDao;
import cn.psw.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    InputStream is = null;
    SqlSession session = null;
    private AccountDao accountDao;
    @Before
    public void init() throws Exception{
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        accountDao = session.getMapper(AccountDao.class);
    }
    @After
    public void destroy() throws Exception{
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void run2(){
        List<Account> accounts = accountDao.findAll();
        for (Account account:accounts){
            System.out.println(account);
        }
    }

    @Test
    public void run3(){
        Account account = new Account();
        account.setName("程庆");
        account.setMoney(5006.0);
        accountDao.saveAccount(account);
    }
}
