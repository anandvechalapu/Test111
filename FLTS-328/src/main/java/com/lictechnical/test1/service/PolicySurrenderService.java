package com.lictechnical.test1.service;

import com.lictechnical.test1.model.CommonDocsTempEntity;
import com.lictechnical.test1.model.PolicySurrenderApiResponse;
import com.lictechnical.test1.repository.PolicySurrenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicySurrenderService {

    @Autowired
    PolicySurrenderRepository policySurrenderRepository;

    public PolicySurrenderApiResponse uploadDocument(CommonDocsTempEntity commonDocsTempEntity) {
        return policySurrenderRepository.uploadDocument(commonDocsTempEntity);
    }

    public PolicySurrenderApiResponse uploadDocumentError() {
        return policySurrenderRepository.uploadDocumentError();
    }
}