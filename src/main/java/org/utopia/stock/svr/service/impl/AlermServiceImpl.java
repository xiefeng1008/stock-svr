package org.utopia.stock.svr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.utopia.stock.svr.dao.AlermMapper;
import org.utopia.stock.svr.entity.Alerm;
import org.utopia.stock.svr.service.AlermService;
import org.utopia.stock.svr.utils.CsvImportUtil;
import org.utopia.stock.svr.utils.IdWorker;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class AlermServiceImpl implements AlermService {
    @Resource
    private IdWorker idWorker;
    @Resource
    private AlermMapper mapper;

    @Override
    public int importCsv(MultipartFile file) {
        List<List<String>> lists = convertCsv(file, 3);
        if (lists != null && lists.size() > 0) {
            mapper.deleteByDate(lists.get(0).get(0));
        }
        lists.stream().forEach(info -> {
            mapper.insertSelective(
                    Alerm.builder().id(idWorker.nextId()).date(info.get(0)).code(info.get(1)).reason(info.get(2)).build());
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
