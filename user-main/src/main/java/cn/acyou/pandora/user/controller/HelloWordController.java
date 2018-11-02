package cn.acyou.pandora.user.controller;

import cn.acyou.pandora.entity.Student;
import cn.acyou.pandora.service.OrderCommonService;
import cn.acyou.pandora.service.StudentService;
import cn.acyou.pandora.util.RandomValue;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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

    @Autowired
    private StudentService studentService;

    @RequestMapping
    @ResponseBody
    public Object hello(){
        log.info("执行方法");
        String result = orderCommonService.getInfoFromOrder();
        log.info("执行结果：" + result);
        return "hello";
    }

    @RequestMapping(value = "addStudent", method = {RequestMethod.GET})
    @ResponseBody
    public Object addStudent(){
        //执行本地方法
        Student student = new Student();
        student.setName(RandomValue.getName());
        student.setAge(RandomUtils.nextInt(100));
        student.setBirth(RandomValue.randomDate());
        studentService.addStudent(student);
        return student;
    }
}
