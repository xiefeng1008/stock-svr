package org.utopia.stock.svr.dao;

import org.apache.ibatis.annotations.Delete;
import org.utopia.stock.svr.entity.Hold;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface HoldMapper extends Mapper<Hold> {

    @Delete("delete from hold where date = #{date}")
    int deleteByDate(String date);

}
