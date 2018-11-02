package cn.bdqn;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class EbooksystemEbookConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbooksystemEbookConsumerApplication.class, args);
    }
}
