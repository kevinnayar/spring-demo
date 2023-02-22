package com.tryalclinical.demo.organization;

import java.io.Serializable;
import java.util.Date;

public class OrganizationResponse implements Serializable {
    private Long id;
    private String name;
    private String type;

    public OrganizationResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}