package mychatroom.mappers;

import io.lettuce.core.dynamic.annotation.Param;
import mychatroom.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper<T> {

    /**
     * 根据username更新
     */
    Integer updateByUsername(@Param("bean") T t, @Param("username") String username);


    /**
     * 根据username删除
     */
    Integer deleteByUsername(@Param("username") String username);


    /**
     * 根据username获取对象
     */
    T selectByUsername(@Param("username") String username);


    void insert(User user);
}
