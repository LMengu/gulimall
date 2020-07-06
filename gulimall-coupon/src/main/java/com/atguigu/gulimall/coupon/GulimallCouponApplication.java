package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1)引入依赖，
 * 2）创建一个bootstrap.properties
 * 3)需要给配置中心添加一个叫数据集
 * 4）给应用名.properties添加任何配置
 * 5）动态获取配置。
 * @RefreshScope
 * @Value("${配置项的名}"):获取到配置。
 *
 * 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 */


@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
