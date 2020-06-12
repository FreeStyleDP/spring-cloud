package com.fs.study.springcloudapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author dengping
 * @date 2020/6/10 15:58
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable //必须序列化
{
    @TableId(value = "deptno", type = IdType.AUTO)
    private Long deptno;   //主键

    private String dname;   //部门名称

    private String db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
//    public Dept(String dname)
//    {
//        super();
//        this.dname = dname;
//    }



}





