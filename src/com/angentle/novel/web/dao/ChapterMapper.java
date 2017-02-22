package com.angentle.novel.web.dao;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.web.model.Chapter;
import com.angentle.novel.web.model.ChapterExample;
import com.angentle.novel.web.model.ChapterWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChapterMapper extends GenericDao<Chapter, String>{
    long countByExample(ChapterExample example);

    int deleteByExample(ChapterExample example);

    int deleteByPrimaryKey(String chapterId);

    int insert(ChapterWithBLOBs record);

    int insertSelective(ChapterWithBLOBs record);

    List<ChapterWithBLOBs> selectByExampleWithBLOBs(ChapterExample example);

    List<Chapter> selectByExample(ChapterExample example);

    ChapterWithBLOBs selectByPrimaryKey(String chapterId);

    int updateByExampleSelective(@Param("record") ChapterWithBLOBs record, @Param("example") ChapterExample example);

    int updateByExampleWithBLOBs(@Param("record") ChapterWithBLOBs record, @Param("example") ChapterExample example);

    int updateByExample(@Param("record") Chapter record, @Param("example") ChapterExample example);

    int updateByPrimaryKeySelective(ChapterWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChapterWithBLOBs record);

    int updateByPrimaryKey(Chapter record);
}