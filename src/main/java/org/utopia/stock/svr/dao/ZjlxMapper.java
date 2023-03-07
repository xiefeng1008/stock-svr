package org.utopia.stock.svr.dao;

import org.apache.ibatis.annotations.Delete;
import org.utopia.stock.svr.entity.Zjlx;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ZjlxMapper extends Mapper<Zjlx> {

    @Delete("delete from zjlx where date = #{date}")
    int deleteByDate(String date);

}
