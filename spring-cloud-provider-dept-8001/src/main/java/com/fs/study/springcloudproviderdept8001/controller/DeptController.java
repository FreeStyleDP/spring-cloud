package com.fs.study.springcloudproviderdept8001.controller;

import com.fs.study.springcloudapi.entity.Dept;
import com.fs.study.springcloudproviderdept8001.mapper.DeptMapper;
import com.fs.study.springcloudproviderdept8001.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author fs
 * @since 2020-06-11
 */
@RestController
@RequestMapping("/springcloudproviderdept8001/dept")
public class DeptController extends BaseController {

    @Autowired
    private IDeptService iDeptService;

    @Autowired
    private DeptMapper deptMapper;


    @PostMapping("/add")
    public int add(@RequestBody Dept dept) {
        return deptMapper.insert1(dept);
    }

    @PostMapping("/get")
    public Dept getById(@RequestBody Dept dept) {
        return iDeptService.getById(dept.getDeptno());
    }

    @PostMapping("/list")
    public List<Dept> list() {
        List<Dept> list = iDeptService.list();
        return list;
    }
}
