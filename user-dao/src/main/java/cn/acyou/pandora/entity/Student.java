package cn.acyou.pandora.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author youfang
 * @version [1.0.0, 2018-11-02 下午 04:15]
 **/
@Data
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1436626947762831679L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator="JDBC")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "birth")
    private Date birth;
}
