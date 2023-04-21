package com.lictechnical.test1.controller;

import com.lictechnical.test1.model.CommonDocsTempEntity;
import com.lictechnical.test1.model.PolicySurrenderApiResponse;
import com.lictechnical.test1.service.PolicySurrenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicySurrenderController {

    @Autowired
    PolicySurrenderService policySurrenderService;

    @PostMapping("/upload-document")
    public PolicySurrenderApiResponse uploadDocument(@RequestBody CommonDocsTempEntity commonDocsTempEntity) {
        return policySurrenderService.uploadDocument(commonDocsTempEntity);
    }

    @PostMapping("/upload-document-error")
    public PolicySurrenderApiResponse uploadDocumentError() {
        return policySurrenderService.uploadDocumentError();
    }
}