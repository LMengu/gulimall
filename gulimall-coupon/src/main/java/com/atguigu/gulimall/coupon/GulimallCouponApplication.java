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
 * 2.细节
 *  1）命名空间：配置隔离
 *      默认：public(保留空间)： 默认新增的所有配置都在public空间。
 *      1.开发：测试，生产产：利用命名空间来做环境隔离。
 *          注意 在配置上，需要使用那个命名空间下的配置，就用它的id;
 *  配置集：所有的配置集合
 *  配置ID：类似文件名
 *  配置分组：
 *      默认所有的配置都属于：DEAULT_GROUP
 *
 * 每个微服务创建自己的命名空间，使用配置分组区分环境：dev,test,prod
 *
 * 3.同时加载多个配置集
 * 微服务任何配置信息，任何配置文件中获取值获取值，都能使用。
 * 配置中心优先使用配置中心的。
 *
 *
 *  2）配置集
 *  3）配置ID
 *  4）配置分组
 *
 *
 */


@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
