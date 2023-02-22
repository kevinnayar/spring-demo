package com.tryalclinical.demo.organization;

import com.tryalclinical.demo.organization.OrganizationRequest;
import com.tryalclinical.demo.organization.OrganizationResponse;
import com.tryalclinical.demo.organization.OrganizationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper {
    OrganizationMapper MAPPER = Mappers.getMapper(OrganizationMapper.class);
    OrganizationEntity fromRequestToEntity(OrganizationRequest organizationRequest);
    OrganizationResponse fromEntityToResponse(OrganizationEntity organizationEntity);
}