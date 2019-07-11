package com.cg.service;

import com.cg.bean.UserData;

public interface UserService {
 String addUser(String fname,String lname);
 UserData findUser(int id);
}
