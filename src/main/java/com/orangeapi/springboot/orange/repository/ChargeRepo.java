package com.orangeapi.springboot.orange.repository;

import com.orangeapi.springboot.orange.entity.ChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChargeRepo extends JpaRepository<ChargeEntity, Integer> {

    @Query(value = "SELECT t FROM ChargeEntity t " +
            "WHERE (6371 * ACOS(COS(RADIANS(:lat)) * COS(RADIANS(t.lat)) * COS(RADIANS(t.lng) - RADIANS(:lng)) + SIN(RADIANS(:lat)) * SIN(RADIANS(t.lat)))) < 5")
    List<ChargeEntity> distance(@Param("lat") double lat, @Param("lng") double lng);

}
