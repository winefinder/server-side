package com.ssf.prototype.wwine.controller;

import com.ssf.prototype.wwine.model.Retail;
import com.ssf.prototype.wwine.service.RetailService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/retail")
public class RetailController {
    private final RetailService retailService;
    public RetailController(RetailService retailService){
        this.retailService = retailService;
    }

    @GetMapping("info")
    public Retail info()
    {
        Retail a = retailService.getinfo();
        return a;
    }
    @CrossOrigin("*")
    @GetMapping("infoall")
    public List<Retail> infoall()
    {
        List<Retail> a = retailService.getinfoall();
        return a;
    }
    @CrossOrigin("*")
    @GetMapping("{id}")
    public Retail findById(@PathVariable int id){
        Retail retail = retailService.findById(id);
        return retail;
    }

    @RequestMapping("inquery")
    public List<Retail> inquery(HttpServletRequest request){
        Double LocationX = Double.parseDouble(request.getParameter("lng"));
        Double LocationY = Double.parseDouble(request.getParameter("lat"));
        String ProductId = request.getParameter("wid");
        int Radius = Integer.parseInt(request.getParameter("radius"));

        List<Retail> result = retailService.calcByDist(LocationX,LocationY,Radius);

        return result;
        //Push Code
        //return "OK";
    }

    @GetMapping("find/Location")
    public List<Retail> findByLocation(){
        List<Retail> retails = retailService.findByLocation();
        return retails;
    }


}
