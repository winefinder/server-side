package com.ssf.prototype.wwine.service;

import com.ssf.prototype.wwine.dao.ProductDAO;
import com.ssf.prototype.wwine.model.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Transactional
    public List<Wine> findByName(String wineName){ return productDAO.findByName(wineName); }
}
