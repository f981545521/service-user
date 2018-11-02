package cn.acyou.pandora.service.impl;

import cn.acyou.pandora.entity.Student;
import cn.acyou.pandora.mapper.StudentMapper;
import cn.acyou.pandora.service.OrderCommonService;
import cn.acyou.pandora.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author youfang
 * @version [1.0.0, 2018-11-02 下午 04:19]
 **/
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private OrderCommonService orderCommonService;

    @Override
    public int addStudent(Student student) {
        log.info("执行Order模块方法-------》");
        orderCommonService.addOrderInfo();
        log.info("添加学生用户："+student);
        return studentMapper.insertSelective(student);
    }
}
