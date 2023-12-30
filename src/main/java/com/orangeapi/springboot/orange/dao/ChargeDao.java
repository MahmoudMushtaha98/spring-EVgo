package com.orangeapi.springboot.orange.dao;

import com.orangeapi.springboot.orange.entity.ChargeEntity;
import com.orangeapi.springboot.orange.repository.ChargeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeDao {

    @Autowired
    private ChargeRepo chargeRepo;

    public List<ChargeEntity> getAllData(){
        return chargeRepo.findAll();
    }

    public ChargeEntity saveData(ChargeEntity charge){
        return chargeRepo.save(charge);
    }
}
