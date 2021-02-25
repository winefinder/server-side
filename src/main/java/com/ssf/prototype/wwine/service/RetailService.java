package com.ssf.prototype.wwine.service;

import com.ssf.prototype.wwine.dao.RetailDAO;
import com.ssf.prototype.wwine.model.Retail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class RetailService {
    @Autowired
    private RetailDAO retailDAO;

    @Transactional
    public Retail getinfo(){
        return retailDAO.getinfo();
    }

    @Transactional
    public List<Retail> getinfoall(){
        return retailDAO.getinfoall();
    }

    @Transactional
    public List<Retail> findByLocation(){ return retailDAO.findByLocation(); }

    @Transactional
    public Retail findById(int RTL_ID) { return retailDAO.findById(RTL_ID); }

    @Transactional
    public List<Retail> calcByDist(double LOCATIONX, double LOCATIONY,int Radius) { return retailDAO.calcByDist(LOCATIONX,LOCATIONY,Radius); }
}
