package top.xujie;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.xujie.response.UserItem;

import java.util.List;

/**
 * @author xujie
 */
@SpringBootApplication
@EnableDubbo
@Slf4j
public class DateConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateConsumerApplication.class, args);
    }

    @Reference(version = "1.0.0")
    private UserService userService;

    @Bean
    public ApplicationRunner listUser() {
        return args -> {

            List<UserItem> items = userService.userList();
            for (UserItem item : items) {
                log.info("item:", item);
            }
        };
    }

}
