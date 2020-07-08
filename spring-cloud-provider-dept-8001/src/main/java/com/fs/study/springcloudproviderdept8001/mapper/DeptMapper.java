package com.fs.study.springcloudproviderdept8001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fs.study.springcloudapi.entity.Dept;
import org.apache.ibatis.annotations.Insert;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fs
 * @since 2020-06-11
 */
public interface DeptMapper extends BaseMapper<Dept> {


    @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE());")
    int insert1(Dept dept);
    

}
