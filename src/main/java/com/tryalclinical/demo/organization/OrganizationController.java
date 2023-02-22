package com.tryalclinical.demo.organization;

import com.tryalclinical.demo.organization.OrganizationEntity;
import com.tryalclinical.demo.organization.OrganizationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping
    public List<OrganizationEntity> findAll() {
        return organizationService.findAll();
    }

    @PostMapping
    public OrganizationEntity save(@RequestBody OrganizationEntity organizationEntity) {
        return organizationService.save(organizationEntity);
    }
}
