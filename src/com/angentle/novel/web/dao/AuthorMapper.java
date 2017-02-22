package com.angentle.novel.web.dao;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.web.model.Author;
import com.angentle.novel.web.model.AuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorMapper extends GenericDao<Author, String>{
    long countByExample(AuthorExample example);

    int deleteByExample(AuthorExample example);

    int deleteByPrimaryKey(String authorId);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(String authorId);

    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}