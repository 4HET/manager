package code.service;

import code.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> selectAll();
}
