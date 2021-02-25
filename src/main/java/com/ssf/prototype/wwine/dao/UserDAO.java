package com.ssf.prototype.wwine.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDAO {
    public int save(String USERID, String USERNICKNAME, String USERNAME);
}
