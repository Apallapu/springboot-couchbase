package com.apallapu.springdata.sample.service;

import javax.validation.Valid;

import com.apallapu.springdata.sample.entities.Company;

import java.util.List;

public interface CompanyService {

    Company save(@Valid Company building);

    Company findById(String buildingId);

    List<Company> findByCompanyId(String companyId);

    Company findByCompanyAndAreaId(String companyId, String areaId);

    List<Company> findByCompanyIdAndNameLike(String companyId, String name, int page);

    List<Company> findByPhoneNumber(String telephoneNumber);

    Long countBuildings(String companyId);

}
