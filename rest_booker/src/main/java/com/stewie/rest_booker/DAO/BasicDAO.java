package com.stewie.rest_booker.DAO;

import java.util.List;

public interface BasicDAO {

    User getUserByID(int userID) throws Exception;
    List<User> getAllUsers();
    void addUser();
    void deleteUser();
    User getUserByEmailAndPassword();
    
} 