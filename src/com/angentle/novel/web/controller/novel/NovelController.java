package com.angentle.novel.web.controller.novel;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.angentle.novel.web.model.Novel;
import com.angentle.novel.web.service.novel.NovelService;

/**
 * 
* @ClassName: NovelController 
* @Description: (前台)小说Controller
* @author wenquan
* @date 2017年2月28日 上午9:34:46 
*
 */
@Controller
public class NovelController {

	@Resource
	NovelService novelService;
	
	Logger logger = LoggerFactory.getLogger(NovelController.class);
	/**
	 * 
	* @Title: searchNovel 
	* @Description: 小说搜索 
	* @param @param keyword
	* @param @param map
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping("/search")
	public String searchNovel(
			@RequestParam(value="keyword",required=false) String keyword,
			ModelMap map){
		Novel novel = new Novel();
				//TODO;
		novel.setNovelName(keyword);
		List<Novel> novelList = this.novelService.selectBySearch(novel);
		map.put("novelList", novelList);
		return "/novel/searchResult";
	}
}
