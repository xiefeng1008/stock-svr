package org.utopia.stock.svr.dao;

import org.apache.ibatis.annotations.Delete;
import org.utopia.stock.svr.entity.Dzjy;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface DzjyMapper extends Mapper<Dzjy> {

    @Delete("delete from dzjy where date = #{date}")
    int deleteByDate(String date);

}
