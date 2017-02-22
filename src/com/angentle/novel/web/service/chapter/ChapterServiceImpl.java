package com.angentle.novel.web.service.chapter;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.core.generic.GenericServiceImpl;
import com.angentle.novel.web.dao.ChapterMapper;
import com.angentle.novel.web.enums.EnumChapterStatus;
import com.angentle.novel.web.model.Chapter;
import com.angentle.novel.web.model.ChapterWithBLOBs;
/**
 * 
* @ClassName: ChapterServiceImpl 
* @Description: 章节Service实现
* @author allen
* @date 2017年2月22日 下午10:30:53 
*
 */
@Service
public class ChapterServiceImpl extends GenericServiceImpl<Chapter, String> implements ChapterService{

	@Resource
	ChapterMapper chapterMapper;
	@Override
	public int publishChapter(String chapterId) {
		ChapterWithBLOBs record = new ChapterWithBLOBs();
		record.setChapterId(chapterId);
		record.setChapterStatus(EnumChapterStatus.PUBLISHED.getCode());
		return this.chapterMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteChapter(String chapterId) {
		ChapterWithBLOBs record = new ChapterWithBLOBs();
		record.setChapterId(chapterId);
		record.setChapterStatus(EnumChapterStatus.RECYCLED.getCode());
		return 0;
	}

	@Override
	public int recycleChapter(String chapterId) {
		ChapterWithBLOBs record = new ChapterWithBLOBs();
		record.setChapterId(chapterId);
		record.setChapterStatus(EnumChapterStatus.DRAFT.getCode());
		return this.chapterMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int completelyDelete(String chapterId) {
		ChapterWithBLOBs record = new ChapterWithBLOBs();
		record.setChapterId(chapterId);
		record.setChapterStatus(EnumChapterStatus.DELETEED.getCode());
		return this.chapterMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public GenericDao<Chapter, String> getDao() {
		return this.chapterMapper;
	}
}
