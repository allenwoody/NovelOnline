package com.angentle.novel.web.service.author;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.core.generic.GenericServiceImpl;
import com.angentle.novel.web.dao.AuthorMapper;
import com.angentle.novel.web.model.Author;
/**
 * 
* @ClassName: AuthorServiceImpl 
* @Description: 作者Service实现类 
* @author allen
* @date 2017年2月18日 下午1:46:42 
*
 */
@Service
public class AuthorServiceImpl extends GenericServiceImpl<Author, String> implements AuthorService{

	@Resource
	AuthorMapper authorMapper;
	@Override
	public GenericDao<Author, String> getDao() {
		return this.authorMapper;
	}

}
