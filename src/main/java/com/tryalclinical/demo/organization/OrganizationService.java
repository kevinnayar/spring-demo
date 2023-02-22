package com.tryalclinical.demo.organization;

import com.tryalclinical.demo.organization.OrganizationRequest;
import com.tryalclinical.demo.organization.OrganizationResponse;
import com.tryalclinical.demo.organization.OrganizationEntity;
import java.util.List;
import java.util.Optional;

public interface OrganizationService {
    List<OrganizationEntity> findAll();
    OrganizationEntity save(OrganizationEntity organizationEntity);
    OrganizationResponse save(OrganizationRequest organizationRequest);
}