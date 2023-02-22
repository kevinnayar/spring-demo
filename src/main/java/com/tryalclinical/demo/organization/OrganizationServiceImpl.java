package com.tryalclinical.demo.organization;

import com.tryalclinical.demo.organization.OrganizationMapper;
import com.tryalclinical.demo.organization.OrganizationRequest;
import com.tryalclinical.demo.organization.OrganizationResponse;
import com.tryalclinical.demo.organization.OrganizationEntity;
import com.tryalclinical.demo.organization.OrganizationRepository;
import com.tryalclinical.demo.organization.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public List<OrganizationEntity> findAll() {
        return organizationRepository.findAll();
    }

    @Override
    public OrganizationEntity save(OrganizationEntity organizationEntity) {
        return organizationRepository.save(organizationEntity);
    }

    @Override
    public OrganizationResponse save(OrganizationRequest organizationRequest) {
        OrganizationEntity organizationEntity = OrganizationMapper.MAPPER.fromRequestToEntity(organizationRequest);
        organizationRepository.save(organizationEntity);
        return OrganizationMapper.MAPPER.fromEntityToResponse(organizationEntity);
    }
}