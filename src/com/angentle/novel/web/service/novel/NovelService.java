package com.angentle.novel.web.service.novel;

import java.util.List;

import com.angentle.novel.core.generic.GenericService;
import com.angentle.novel.web.model.Novel;
/**
 * 
* @ClassName: NovelService 
* @Description: 小说服务接口
* @author allen
* @date 2017年2月18日 下午1:42:51 
*
 */
public interface NovelService extends GenericService<Novel, String>{
	/**
	 * 
	* @Title: selectNovels 
	* @Description: 查询作者的作品
	* @param @return    设定文件 
	* @return Novel    返回类型 
	* @throws
	 */
	public List<Novel> selectNovelsByAuthor(String userId);
	
	public List<Novel> selectBySearch(Novel novel);
	
	
}
