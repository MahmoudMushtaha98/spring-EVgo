package com.orangeapi.springboot.orange.controller;

import com.orangeapi.springboot.orange.dao.ChargeDao;
import com.orangeapi.springboot.orange.entity.ChargeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChargeController {

    @Autowired
    private ChargeDao chargeDao;

    @GetMapping(path = "/charge-points")
    List<ChargeEntity> getAllData(){
        return this.chargeDao.getAllData();
    }

    @PostMapping(path = "insert-data")
    ChargeEntity saveData(@RequestBody ChargeEntity charge){
        return chargeDao.saveData(charge);
    }
}
