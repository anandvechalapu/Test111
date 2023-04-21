package com.lictechnical.test1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lictechnical.test1.model.TopupdaEntity;
import com.lictechnical.test1.model.TopupdaTempEntity;
import com.lictechnical.test1.repository.TopupdaRepository;

@Service
public class TopupdaService {

    @Autowired
    private TopupdaRepository topupdaRepository;

    public int sendToApprove(Long topupId, String topupStatus, String amountStatus, Long modifiedOn) {
        return topupdaRepository.sendToApprove(topupId, topupStatus, amountStatus, modifiedOn);
    }

    public Optional<TopupdaEntity> getTopupdaEntity(Long topupId) {
        return topupdaRepository.findById(topupId);
    }

    public Optional<TopupdaTempEntity> getTopupdaTempEntity(Long topupId) {
        return topupdaRepository.findById(topupId);
    }

}