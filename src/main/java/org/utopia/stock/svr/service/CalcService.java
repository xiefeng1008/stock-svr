package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CalcService {

    void parabolicModel();


    /**
     * 计算近20个交易日第一次创新高；
     * 近20个交易日低迷
     * 资金净流入
     * 成交量是前5个交易日之和
     *
     * @param date
     * @return
     */
    List<String> recommendNewHighFirst(String date);


    /**
     * 计算第二次创新高
     * @param data
     * @return
     */
    List<String> recommendNewHighSecond(String data);

}
