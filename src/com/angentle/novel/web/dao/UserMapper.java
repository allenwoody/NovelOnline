package com.angentle.novel.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.angentle.novel.core.feature.orm.mybatis.Page;
import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.web.model.User;
import com.angentle.novel.web.model.UserExample;

public interface UserMapper extends GenericDao<User, String>{
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    List<User> selectByExample(Page<User> page, UserExample example);
    
    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}