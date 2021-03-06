package com.angentle.novel.web.service.novel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.core.generic.GenericServiceImpl;
import com.angentle.novel.web.dao.AuthorMapper;
import com.angentle.novel.web.dao.NovelMapper;
import com.angentle.novel.web.model.Author;
import com.angentle.novel.web.model.AuthorExample;
import com.angentle.novel.web.model.Novel;
import com.angentle.novel.web.model.NovelExample;
/**
 * 
* @ClassName: NovelServiceImpl 
* @Description: 小说Service实现 
* @author wenquan
* @date 2017年2月28日 上午9:42:22 
*
 */
@Service
public class NovelServiceImpl extends GenericServiceImpl<Novel, String> implements NovelService{

	@Resource
	NovelMapper novelMapper;
	@Resource
	AuthorMapper authorMapper;
	
	@Override
	public GenericDao<Novel, String> getDao() {
		return this.novelMapper;
	}

	@Override
	public List<Novel> selectNovelsByAuthor(String userId) {
		AuthorExample authorExample = new AuthorExample();
		authorExample.createCriteria().andUserIdEqualTo(userId);
		Author author = this.authorMapper.selectByExample(authorExample ).get(0);
		NovelExample example = new NovelExample();
		example.createCriteria().andAuthorIdEqualTo(author.getAuthorId());
		return this.novelMapper.selectByExample(example );
	}

	@Override
	public List<Novel> selectBySearch(Novel novel) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
