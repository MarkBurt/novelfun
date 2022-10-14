package com.alsyun.novelfun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
@ServletComponentScan
@MapperScan(basePackages = {"com.alsyun.novelfun.mapper"})
public class CrawlNovelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlNovelApplication.class);
    }


}
