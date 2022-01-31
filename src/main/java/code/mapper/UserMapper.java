package code.mapper;

import code.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from user_information")
    List<User> selectAll();
}
