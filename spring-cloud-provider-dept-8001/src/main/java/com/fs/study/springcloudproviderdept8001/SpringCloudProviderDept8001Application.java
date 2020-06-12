package com.fs.study.springcloudproviderdept8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.fs.study.springcloudproviderdept8001.mapper")
@SpringBootApplication
//    (exclude= {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringCloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderDept8001Application.class, args);
    }

}
