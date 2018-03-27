package com.sudalover.service;

import com.sudalover.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public String getUserInfo() {
        return userDAO.select().getId() + "user service";
    }
}
