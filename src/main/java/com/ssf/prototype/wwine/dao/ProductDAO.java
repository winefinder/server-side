package com.ssf.prototype.wwine.dao;

import com.ssf.prototype.wwine.model.Wine;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductDAO {

    public List<Wine> findByName(String wineName);
}
