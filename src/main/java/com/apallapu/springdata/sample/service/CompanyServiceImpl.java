package com.apallapu.springdata.sample.service;

import com.apallapu.springdata.sample.entities.Company;
import com.apallapu.springdata.sample.repositories.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository buildingRepository;

    @Override
    public List<Company> findByCompanyId(String companyId) {
        return buildingRepository.findByCompanyId(companyId);
    }

    public List<Company> findByCompanyIdAndNameLike(String companyId, String name, int page) {
        return buildingRepository.findByCompanyIdAndNameLikeOrderByName(companyId, name, new PageRequest(page, 20))
                .getContent();
    }

    @Override
    public Company findByCompanyAndAreaId(String companyId, String areaId) {
        return buildingRepository.findByCompanyAndAreaId(companyId, areaId);
    }

    @Override
    public List<Company> findByPhoneNumber(String telephoneNumber) {
        return buildingRepository.findByPhoneNumber(telephoneNumber);
    }

    @Override
    public Company findById(String buildingId) {
        return buildingRepository.findOne(buildingId);
    }

    @Override
    public Company save(@Valid Company building) {
        return buildingRepository.save(building);
    }

    @Override
    public Long countBuildings(String companyId) {
        return buildingRepository.countBuildings(companyId);
    }

}
