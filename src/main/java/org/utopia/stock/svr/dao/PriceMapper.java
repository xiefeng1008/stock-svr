package org.utopia.stock.svr.dao;

import org.apache.ibatis.annotations.Delete;
import org.utopia.stock.svr.entity.Price;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface PriceMapper extends Mapper<Price> {

    @Delete("delete from price where date = #{date}")
    int deleteByDate(String date);

}
