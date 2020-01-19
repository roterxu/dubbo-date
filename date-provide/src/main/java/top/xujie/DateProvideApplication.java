package top.xujie;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xujie
 */
@SpringBootApplication
@EnableDubbo
public class DateProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateProvideApplication.class, args);
    }

}
