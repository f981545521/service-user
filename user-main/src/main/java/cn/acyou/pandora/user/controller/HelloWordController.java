package cn.acyou.pandora.user.controller;

import cn.acyou.pandora.service.OrderCommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author youfang
 * @version [1.0.0, 2018-09-29 下午 04:22]
 **/
@Slf4j
@Controller
@RequestMapping("hello")
public class HelloWordController {

    @Autowired
    private OrderCommonService orderCommonService;

    @RequestMapping
    @ResponseBody
    public Object hello(){
        log.info("执行方法");
        String result = orderCommonService.getInfoFromOrder();
        log.info("执行结果：" + result);
        return "hello";
    }
}
