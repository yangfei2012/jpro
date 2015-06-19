package org.fei.test.service.impl;

import org.fei.test.CrmDmBdsBms;
import org.fei.test.CrmDmDbsBmsMapper;
import org.fei.test.dao.CrmDmBdsBmsExtMapper;
import org.fei.test.service.CrmDmQueryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CrmDmQueryServiceImpl implements CrmDmQueryService {

    @Autowired
    private CrmDmBdsBmsExtMapper crmDmBdsBmsExtMapper;

    @Override
    public List<CrmDmBdsBms> getSalerListByCityId(Long cityId) {
        return crmDmBdsBmsExtMapper.findSalerListByCityId(cityId);
    }
}
