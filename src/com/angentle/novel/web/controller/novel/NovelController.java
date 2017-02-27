package com.angentle.novel.web.controller.novel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.angentle.novel.core.generic.GenericController;
import com.angentle.novel.web.model.Novel;
import com.angentle.novel.web.service.novel.NovelService;

@Controller
@RequestMapping("/novel")
public class NovelController extends GenericController{
	@Resource
	NovelService novelService;
	
	/**
	 * 
	* @Title: listNovel 
	* @Description: 作品管理-小说列表 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping("/myNovles")
	public String listMyNovel(ModelMap map){
		List<Novel> novelList = this.novelService.selectNovels(this.getLoginUser().getUserId());
		map.put("novelList", novelList);
		return "/novel/myNovles";
	}
	/**
	 * 
	* @Title: publishedChapter 
	* @Description: 已发布的章节
	* @param @param chapterId
	* @param @param map
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping("/chapterManager/{chapterId}")
	public String publishedChapter(@PathVariable() String chapterId, ModelMap map){
		
		return "/publishedChapter";
	}
}
