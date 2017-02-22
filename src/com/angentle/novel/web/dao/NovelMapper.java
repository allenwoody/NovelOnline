package com.angentle.novel.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.web.model.Novel;
import com.angentle.novel.web.model.NovelExample;

public interface NovelMapper extends GenericDao<Novel, String>{
    long countByExample(NovelExample example);

    int deleteByExample(NovelExample example);

    int deleteByPrimaryKey(String novelId);

    int insert(Novel record);

    int insertSelective(Novel record);

    List<Novel> selectByExample(NovelExample example);

    Novel selectByPrimaryKey(String novelId);

    int updateByExampleSelective(@Param("record") Novel record, @Param("example") NovelExample example);

    int updateByExample(@Param("record") Novel record, @Param("example") NovelExample example);

    int updateByPrimaryKeySelective(Novel record);

    int updateByPrimaryKey(Novel record);
}