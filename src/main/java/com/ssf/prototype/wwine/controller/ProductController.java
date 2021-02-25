package com.ssf.prototype.wwine.controller;

import com.ssf.prototype.wwine.model.Wine;
import com.ssf.prototype.wwine.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){ this.productService = productService; }
    @CrossOrigin("*")
    @GetMapping("search/{name}")
    public List<Wine> findByName(@PathVariable String name){
        List<Wine> winelist = productService.findByName(name);
        return winelist;
    }
}
