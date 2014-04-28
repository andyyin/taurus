package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.Host;
import com.dp.bigdata.taurus.generated.module.HostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int countByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int deleteByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int insert(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int insertSelective(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    List<Host> selectByExample(HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    Host selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByPrimaryKeySelective(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusHost
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByPrimaryKey(Host record);
}