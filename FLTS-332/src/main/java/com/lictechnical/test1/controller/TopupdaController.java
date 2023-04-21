package com.lictechnical.test1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lictechnical.test1.model.TopupdaEntity;
import com.lictechnical.test1.model.TopupdaTempEntity;
import com.lictechnical.test1.service.TopupdaService;

@RestController
@RequestMapping("/topupda")
public class TopupdaController {

    @Autowired
    private TopupdaService topupdaService;

    @PostMapping("/sendToApprove")
    public int sendToApprove(@RequestBody Long topupId, @RequestBody String topupStatus, @RequestBody String amountStatus, @RequestBody Long modifiedOn) {
        return topupdaService.sendToApprove(topupId, topupStatus, amountStatus, modifiedOn);
    }

    @PostMapping("/getTopupdaEntity")
    public Optional<TopupdaEntity> getTopupdaEntity(@RequestBody Long topupId) {
        return topupdaService.getTopupdaEntity(topupId);
    }

    @PostMapping("/getTopupdaTempEntity")
    public Optional<TopupdaTempEntity> getTopupdaTempEntity(@RequestBody Long topupId) {
        return topupdaService.getTopupdaTempEntity(topupId);
    }

}