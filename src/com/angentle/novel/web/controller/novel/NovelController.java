package com.angentle.novel.web.controller.novel;

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
	@RequestMapping("/search")
	public String searchNovel(
			@RequestParam(value="keyword",required=false) String keyword,
			ModelMap map){
		Novel novel = new Novel();
				//TODO;
		this.novelService.selectBySearch(novel);
		return "/novel/search";
	}
}
