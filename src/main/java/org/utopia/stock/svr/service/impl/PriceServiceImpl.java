package org.utopia.stock.svr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.utopia.stock.svr.dao.PriceMapper;
import org.utopia.stock.svr.entity.Price;
import org.utopia.stock.svr.service.PriceService;
import org.utopia.stock.svr.utils.CsvImportUtil;
import org.utopia.stock.svr.utils.IdWorker;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private IdWorker idWorker;
    @Resource
    private PriceMapper priceMapper;

    @Override
    public int importCsv(MultipartFile file) {
        List<List<String>> lists = convertCsv(file, 10);
        if (lists != null && lists.size() > 0) {
            priceMapper.deleteByDate(lists.get(0).get(0));
        }
        lists.stream().forEach(info -> {
            priceMapper.insertSelective(
                    Price.builder().id(idWorker.nextId())
                            .date(info.get(0))
                            .code(info.get(1))
                            .name(info.get(2))
                            .startPrice(Double.valueOf(info.get(3)))
                            .endPrice(Double.valueOf(info.get(4)))
                            .hPrice(Double.valueOf(info.get(5)))
                            .lPrice(Double.valueOf(info.get(6)))
                            .changeRate(Double.valueOf(info.get(7)))
                            .turnoverRate(Double.valueOf(info.get(8)))
                            .qrr(Double.valueOf(info.get(9)))
                            .build());
        });

        return lists.size();
    }


    private List<List<String>> convertCsv(MultipartFile file,int colNum) {
        // 使用CSV工具类，生成file文件
        File csvFile = CsvImportUtil.uploadFile(file);
        // 将文件内容解析，存入List容器，List<String>为每一行内容的集合，6为CSV文件每行的总列数
        List<List<String>> lists = CsvImportUtil.readCSV(csvFile.getPath(), colNum);
        return lists;
    }
}
