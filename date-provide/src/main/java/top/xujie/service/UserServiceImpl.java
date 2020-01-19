package top.xujie.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import top.xujie.UserService;
import top.xujie.domain.User;
import top.xujie.response.UserItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujie
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserItem> userList() {
        List<User> userList = new ArrayList<>();
        User user1 = User.builder()
                .id(1)
                .age(11)
                .name("jie.xu")
                .build();

        User user2 = User.builder()
                .id(1)
                .age(11)
                .name("jie.xu2")
                .build();

        User user3 = User.builder()
                .id(1)
                .age(11)
                .name("jie.xu3")
                .build();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        List<UserItem> list = new ArrayList<>();
        for (User user : userList) {
            UserItem item = new UserItem();
            BeanUtils.copyProperties(user, item);
        }
        return list;
    }
}
