package top.xujie;

import top.xujie.response.UserItem;

import java.util.List;

/**
 * @author xujie
 */
public interface UserService {

    /**
     * 查询用户
     * @return
     */
    List<UserItem> userList();
}
