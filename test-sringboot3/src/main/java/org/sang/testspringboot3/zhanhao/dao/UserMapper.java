package org.sang.testspringboot3.zhanhao.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.testspringboot3.zhanhao.pojo.User;
import org.springframework.stereotype.Repository;

@Mapper //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    User selectUserByName(String userName);
}