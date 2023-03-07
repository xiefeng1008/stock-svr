package org.utopia.stock.svr.dao;

import org.apache.ibatis.annotations.Delete;
import org.utopia.stock.svr.entity.Alerm;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface AlermMapper extends Mapper<Alerm> {

    @Delete("delete from alerm where date = #{date}")
    int deleteByDate(String date);

}
