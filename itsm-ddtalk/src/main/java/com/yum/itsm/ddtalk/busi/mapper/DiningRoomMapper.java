package com.yum.itsm.ddtalk.busi.mapper;

import com.yum.itsm.ddtalk.busi.entity.DiningRoom;
import com.yum.itsm.ddtalk.busi.entity.DiningRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiningRoomMapper {
    int countByExample(DiningRoomExample example);

    int deleteByExample(DiningRoomExample example);

    int deleteByPrimaryKey(Long diningRoomId);

    int insert(DiningRoom record);

    int insertSelective(DiningRoom record);

    List<DiningRoom> selectByExample(DiningRoomExample example);

    DiningRoom selectByPrimaryKey(Long diningRoomId);

    int updateByExampleSelective(@Param("record") DiningRoom record, @Param("example") DiningRoomExample example);

    int updateByExample(@Param("record") DiningRoom record, @Param("example") DiningRoomExample example);

    int updateByPrimaryKeySelective(DiningRoom record);

    int updateByPrimaryKey(DiningRoom record);
}