package day08.service;

import day08.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceTest {
    @Autowired
    private UserDao UserDao;

    public void test(){
        UserDao.test();
        System.out.println("serviceTest test...");
    }

}
