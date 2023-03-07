package org.utopia.stock.svr.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.utopia.stock.svr.service.*;

import javax.annotation.Resource;

@RestController
public class CvsController {

    @Resource
    private PriceService priceService;

    @Resource
    private AlermService alermService;

    @Resource
    private DzjyService dzjyService;

    @Resource
    private HoldService holdService;

    @Resource
    private ZjlxService zjlxService;

    @GetMapping(value = "/test")
    public String test() {
        return "hello stock-svr";
    }

    @PostMapping(value ="/csv/price/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void csvPriceImport(@RequestPart("file") MultipartFile file) {
        priceService.importCsv(file);
    }
    @PostMapping(value ="/csv/alerm/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void csvAlermImport(@RequestPart("file") MultipartFile file)  {
        alermService.importCsv(file);
    }

    @PostMapping(value ="/csv/dzjy/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void csvDzjyImport(@RequestPart("file") MultipartFile file) {
        dzjyService.importCsv(file);
    }

    @PostMapping(value ="/csv/hold/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void csvHoldImport(@RequestPart("file") MultipartFile file) {
        holdService.importCsv(file);
    }

    @PostMapping(value ="/csv/zjlx/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void csvZjlxImport(@RequestPart("file") MultipartFile file) {
        zjlxService.importCsv(file);
    }

}
