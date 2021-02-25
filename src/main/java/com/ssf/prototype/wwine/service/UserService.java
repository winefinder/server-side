package com.ssf.prototype.wwine.service;

import com.ssf.prototype.wwine.dao.UserDAO;
import com.ssf.prototype.wwine.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public User join(String userId,String userNickname,String userName){
        return save(userId,userNickname,userName);
    }

    @Transactional
    public User logIn(){
        return null;
    }


    private User save(String userId,String userNickname,String userName){
        User user = new User(userId,userNickname,userName);
        userDAO.save(userId,userNickname,userName);
        return user;
    }
}
