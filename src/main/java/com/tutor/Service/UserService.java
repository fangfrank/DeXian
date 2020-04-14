package com.tutor.Service;

import com.tutor.dao.UserDao;
import com.tutor.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:siwart
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User Sel(int id){
        return userDao.Sel(id);
    }
}