package com.tutor.dao;
import com.tutor.entity.User;
import org.springframework.stereotype.Repository;


/**
 * @Author:siwart
 */

@Repository
public interface UserDao {
    User Sel(int id);
}

