package com.zougn;

import com.zougn.dao.impl.UserDaoMySqlImpl;
import com.zougn.dao.impl.UserDaoOracleImpl;
import com.zougn.service.UserService;
import com.zougn.service.impl.UserServiceImpl;
import org.junit.Test;

public class Spring01ApplicationTests {

    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }


    @Test
    public void test1(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();
    }

}
