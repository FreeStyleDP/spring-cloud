package com.fs.study.springcloudproviderdept8001.controller;

import com.fs.study.springcloudapi.entity.Dept;
import com.fs.study.springcloudproviderdept8001.mapper.DeptMapper;
import com.fs.study.springcloudproviderdept8001.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
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

    private final static String DB_SOURCE = "clouddb01";

    @PostMapping("/add")
    public int add(@RequestBody Dept dept) {
        dept.setDb_source(DB_SOURCE);
        return deptMapper.insert(dept);
    }

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable Long id) {
        return iDeptService.getById(id);
    }

    @RequestMapping("/list")
    public List<Dept> list() {
        List<Dept> list = iDeptService.list();
        return list;
    }
}
