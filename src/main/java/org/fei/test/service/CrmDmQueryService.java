package org.fei.test.service;

import org.fei.test.CrmDmBdsBms;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("crmDmQueryService")
public interface CrmDmQueryService {
    public List<CrmDmBdsBms> getSalerListByCityId(Long cityId);
}
