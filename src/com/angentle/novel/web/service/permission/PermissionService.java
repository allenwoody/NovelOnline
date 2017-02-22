package com.angentle.novel.web.service.permission;

import java.util.List;

import com.angentle.novel.core.feature.orm.mybatis.Page;
import com.angentle.novel.core.generic.GenericService;
import com.angentle.novel.web.model.Permission;

public interface PermissionService extends GenericService<Permission, String> {

	/**
	 * 分页查询
	 * @param page
	 * @param model
	 * @return
	 */
	List<Permission> selectBySearchingPage(Page<Permission> page, Permission model);
	
	/**
	 * 获取一级菜单
	 * @return
	 */
	List<Permission> selectFirstLevelMenus();

	/**
	 * 按角色查询权限
	 * @param roleId
	 * @return
	 */
	List<Permission> selectPermissionsByRoleId(String roleId);

	/**
	 * 按用户查询权限
	 * @param userId
	 * @return
	 */
	List<Permission> selectPermissionsByUserId(String userId);
	
}
