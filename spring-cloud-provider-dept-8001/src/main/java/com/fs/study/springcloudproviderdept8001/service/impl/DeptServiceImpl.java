package com.fs.study.springcloudproviderdept8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fs.study.springcloudapi.entity.Dept;
import com.fs.study.springcloudproviderdept8001.mapper.DeptMapper;
import com.fs.study.springcloudproviderdept8001.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fs
 * @since 2020-06-11
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
