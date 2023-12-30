package com.orangeapi.springboot.orange.repository;

import com.orangeapi.springboot.orange.entity.ChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeRepo extends JpaRepository<ChargeEntity,Integer> {

}
