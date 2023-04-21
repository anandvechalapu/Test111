package com.lictechnical.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lictechnical.test1.model.TopupdaTempEntity;
import com.lictechnical.test1.model.TopupdaEntity;

public interface TopupdaRepository extends JpaRepository<TopupdaEntity, Long> {

    @Query("UPDATE TopupdaTempEntity t SET t.topupStatus=:topupStatus, t.amountStatus=:amountStatus, t.modifiedOn=:modifiedOn WHERE t.topupId = :topupId")
    int sendToApprove(@Param("topupId") Long topupId, @Param("topupStatus") String topupStatus, @Param("amountStatus") String amountStatus, @Param("modifiedOn") Long modifiedOn);

}