package com.sudalover.dao;

import com.sudalover.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    public User select() {
        User user = new User();
        user.setId("id");
        return user;
    }
}
