package org.fei.test;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by fei on 14-9-2.
 */
public interface CrmDmDbsBmsMapper {
    public static String TABLENAME = "crm_dm_bds_bms";
    @Select("select * from "+TABLENAME+" WHERE staff_city_id=#{cityId, jdbcType=BIGINT} limit 10 ")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.BIGINT, id=true),
        @Result(column="Saler_id", property="salerId", jdbcType= JdbcType.BIGINT),
        @Result(column="Saler_name", property="salerName", jdbcType= JdbcType.BIGINT)
    })
    public List<CrmDmBdsBms> findSalerListByCityId(@Param("cityId") Long cityId);
}
