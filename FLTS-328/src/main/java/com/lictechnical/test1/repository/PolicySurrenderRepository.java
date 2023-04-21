package com.lictechnical.test1.repository;

import com.lictechnical.test1.model.CommonDocsTempEntity;
import com.lictechnical.test1.model.PolicySurrenderApiResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PolicySurrenderRepository {

    @PersistenceContext
    EntityManager entityManager;

    ModelMapper modelMapper = new ModelMapper();

    public PolicySurrenderApiResponse uploadDocument(CommonDocsTempEntity commonDocsTempEntity){
        commonDocsTempEntity.setIsActive(true);
        entityManager.persist(commonDocsTempEntity);
        PolicySurrenderApiResponse policySurrenderApiResponse = new PolicySurrenderApiResponse();
        policySurrenderApiResponse.setDocument(modelMapper.map(commonDocsTempEntity, CommonDocsTempEntity.class));
        policySurrenderApiResponse.setSuccessMessage("Document uploaded successfully");
        return policySurrenderApiResponse;
    }

    public PolicySurrenderApiResponse uploadDocumentError(){
        PolicySurrenderApiResponse policySurrenderApiResponse = new PolicySurrenderApiResponse();
        policySurrenderApiResponse.setErrorMessage("There was an error uploading the document");
        policySurrenderApiResponse.setStatus("Error");
        return policySurrenderApiResponse;
    }
}