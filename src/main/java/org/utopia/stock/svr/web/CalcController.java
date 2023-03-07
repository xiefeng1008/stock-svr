package org.utopia.stock.svr.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.utopia.stock.svr.service.*;

import javax.annotation.Resource;

@RestController
public class CalcController {

    @Resource
    private CalcService calcService;

    @GetMapping(value = "/calc/parabola")
    public String parabola() {

        calcService.parabolicModel();


        return "hello parabola";
    }


}
