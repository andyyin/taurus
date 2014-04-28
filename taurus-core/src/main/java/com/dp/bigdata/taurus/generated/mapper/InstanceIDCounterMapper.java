package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.InstanceIDCounter;
import com.dp.bigdata.taurus.generated.module.InstanceIDCounterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstanceIDCounterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int countByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int deleteByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int deleteByPrimaryKey(String instanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int insert(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int insertSelective(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    List<InstanceIDCounter> selectByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    InstanceIDCounter selectByPrimaryKey(String instanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByExampleSelective(@Param("record") InstanceIDCounter record, @Param("example") InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByExample(@Param("record") InstanceIDCounter record, @Param("example") InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByPrimaryKeySelective(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Apr 14 15:21:54 HKT 2014
     */
    int updateByPrimaryKey(InstanceIDCounter record);
}