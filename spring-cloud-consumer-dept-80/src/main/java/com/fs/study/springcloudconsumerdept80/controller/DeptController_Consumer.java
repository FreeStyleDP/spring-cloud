package com.fs.study.springcloudconsumerdept80.controller;

import com.fs.study.springcloudapi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author dengping
 * @date 2020/6/11 15:47
 */
@RestController
@RequestMapping("/springcloudconsumerdept80/dept")
public class DeptController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

    private final static String URL_PRIX = "http://localhost:8001/springcloudproviderdept8001/dept/";

    @PostMapping("/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PRIX + "add", dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable Long id) {
        return restTemplate.getForObject(URL_PRIX + "get/" + id, Dept.class);
    }

    @RequestMapping("/list")
    public List<Dept> list() {
        return restTemplate.postForObject(URL_PRIX + "list", null, List.class);
    }

}
