package org.fei.test.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.fei.test.CrmDmBdsBms;

import java.util.List;

public interface CrmDmBdsBmsExtMapper {
    public static String TABLENAME = "crm_dm_bds_bms";
    //public static final String VIEW ="alias_crm_dm_bds_bms0.`id`, alias_crm_dm_bds_bms0.`Saler_id`, alias_crm_dm_bds_bms0.`Saler_name`, alias_crm_dm_bds_bms0.`Create_date`, alias_crm_dm_bds_bms0.`Creator`, alias_crm_dm_bds_bms0.`Creator_name`, alias_crm_dm_bds_bms0.`Auth_creator`, alias_crm_dm_bds_bms0.`Auth_creator_name`, alias_crm_dm_bds_bms0.`type`, alias_crm_dm_bds_bms0.`staff_city_id`, alias_crm_dm_bds_bms0.`city_name`, alias_crm_dm_bds_bms0.`email`, alias_crm_dm_bds_bms0.`account_enabled`";
    public static final String VIEW ="id, Saler_id, Saler_name, Create_date, Creator, Creator_name, Auth_creator, Auth_creator_name, type, staff_city_id, city_name, email, account_enabled";

    @Select("select "+VIEW+" from "+TABLENAME+" WHERE staff_city_id=#{cityId, jdbcType=BIGINT} limit 10 ")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.BIGINT, id=true),
            @Result(column="Saler_id", property="salerId", jdbcType= JdbcType.BIGINT),
            @Result(column="Saler_name", property="salerName", jdbcType= JdbcType.BIGINT)
    })
    public List<CrmDmBdsBms> findSalerListByCityId(@Param("cityId") Long cityId);
}
