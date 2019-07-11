package com.cg.dao;

import com.cg.bean.UserData;

public interface IUserDao {
String add(UserData user);
UserData findUser(int id);
}
