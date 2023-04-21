package com.lictechnical.test1.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMON_DOCS_TEMP")
public class CommonDocsTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DOC_NAME")
    private String docName;

    @Column(name = "DOC_PATH")
    private String docPath;
    
    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}