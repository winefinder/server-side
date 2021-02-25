package com.ssf.prototype.wwine.dao;

import com.ssf.prototype.wwine.model.Retail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RetailDAO{

    public Retail getinfo();

    public List<Retail> findByLocation();

    public List<Retail> getinfoall();

    public Retail findById(int RTL_ID);

    public List<Retail> calcByDist(double LOCATIONX, double LOCATIONY, int RADIUS);
}
