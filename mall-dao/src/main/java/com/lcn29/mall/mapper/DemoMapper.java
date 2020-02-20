package com.lcn29.mall.mapper;

import com.lcn29.mall.dao.DemoDO;
import java.util.List;

public interface DemoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DemoDO record);

    DemoDO selectByPrimaryKey(Integer id);

    List<DemoDO> selectAll();

    int updateByPrimaryKey(DemoDO record);

}
