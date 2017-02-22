package com.angentle.novel.web.service.chapter;

import com.angentle.novel.core.generic.GenericService;
import com.angentle.novel.web.model.Chapter;

/**
 * 
* @ClassName: ChapterService 
* @Description: 章节service 
* @author allen
* @date 2017年2月22日 下午9:45:30 
*
 */
public interface ChapterService extends GenericService<Chapter, String>{
	
	/**
	 * 
	* @Title: publishChapter 
	* @Description: 发布章节 
	* @param @param chapterId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public int publishChapter(String chapterId);
	
	/**
	 * 
	* @Title: deleteChapter 
	* @Description: 删除章节至回收站 
	* @param @param chapterId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public int deleteChapter(String chapterId);
	
	/**
	 * 
	* @Title: recycleChapter 
	* @Description: 从回收站恢复章节到草稿
	* @param @param chapterId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public int recycleChapter(String chapterId);
	
	/**
	 * 
	* @Title: completelyDelete 
	* @Description: 彻底删除章节 
	* @param @param chapterId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public int completelyDelete(String chapterId);
	
}
