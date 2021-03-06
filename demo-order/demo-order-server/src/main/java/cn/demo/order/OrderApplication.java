package cn.demo.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by IntelliJ IDEA.
 *
 * @Description:
 * @Author: 义云
 * @Created: 2020-04-11 14:52
 */
@EnableFeignClients(basePackages = "cn.demo")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"cn.demo"}, exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = {"cn.demo.order.mapper"})
public class OrderApplication {

  public static void main(String[] args) {

    SpringApplication.run(OrderApplication.class, args);
  }

}
