package com.angentle.novel.web.service.permission;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.angentle.novel.core.feature.orm.mybatis.Page;
import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.core.generic.GenericServiceImpl;
import com.angentle.novel.web.dao.PermissionMapper;
import com.angentle.novel.web.dao.RoleMapper;
import com.angentle.novel.web.dao.RolePermissionMapper;
import com.angentle.novel.web.dao.UserRoleMapper;
import com.angentle.novel.web.enums.EnumBool;
import com.angentle.novel.web.model.Permission;
import com.angentle.novel.web.model.PermissionExample;
import com.angentle.novel.web.model.RolePermission;
import com.angentle.novel.web.model.RolePermissionExample;
import com.angentle.novel.web.model.UserRole;
import com.angentle.novel.web.model.UserRoleExample;
import com.angentle.novel.web.model.PermissionExample.Criteria;

@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, String> implements PermissionService {
	@Resource
	PermissionMapper permissionMapper;
	@Resource
	RolePermissionMapper rolePermissionMapper;
	@Resource
	UserRoleMapper userRoleMapper;
	@Resource
	RoleMapper roleMapper;
	
	@Override
	public int delete(String id) {
		Permission record = new Permission();
		record.setPermissionId(id);
		record.setIsValid(EnumBool.NO.getCode());
		return this.permissionMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Permission selectById(String id) {
		return this.permissionMapper.selectByPrimaryKey(id);
	}

	@Override
	public Permission selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> selectList(Page<Permission> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> selectBySearchingPage(Page<Permission> page, Permission model){
		PermissionExample example = new PermissionExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(model.getPermissionName())) {
			criteria.andPermissionNameLike("%"+model.getPermissionName()+"%");
		}
		criteria.andIsValidEqualTo(EnumBool.YES.getCode());
		example.setOrderByClause("permission_sign");
		return this.permissionMapper.selectByExample(page, example);
	}
	
	@Override
	public List<Permission> selectFirstLevelMenus(){
		PermissionExample example = new PermissionExample();
		example.createCriteria().andIsValidEqualTo(EnumBool.YES.getCode()).andParentIdIsNull();
		return this.permissionMapper.selectByExample(example);
	}
	
	@Override
	public GenericDao<Permission, String> getDao() {
		return this.permissionMapper;
	}

	@Override
	public List<Permission> selectPermissionsByRoleId(String roleId) {
		RolePermissionExample rpExample = new RolePermissionExample();
		rpExample.createCriteria().andRoleIdEqualTo(roleId);
		List<RolePermission> rpList = rolePermissionMapper.selectByExample(rpExample);
		if (rpList.isEmpty()) {
			return ListUtils.EMPTY_LIST;
		}
		List<String> permissionIdList = new ArrayList<>();
		for (RolePermission tRolePermission : rpList) {
			permissionIdList.add(tRolePermission.getPermissionId());
		}
		
		PermissionExample permissionExample = new PermissionExample();
		permissionExample.createCriteria().andIsValidEqualTo(EnumBool.YES.getCode()).andPermissionIdIn(permissionIdList);
		return this.permissionMapper.selectByExample(permissionExample);
	}
	
	@Override
	public List<Permission> selectPermissionsByUserId(String userId) {
		UserRoleExample urExample = new UserRoleExample();
		urExample.createCriteria().andUserIdEqualTo(userId);
		List<UserRole> urList = userRoleMapper.selectByExample(urExample);
		if (urList.isEmpty()) {
			return ListUtils.EMPTY_LIST;
		}
		List<String> roleidList = new ArrayList<>();
		for (UserRole tUserRole : urList) {
			roleidList.add(tUserRole.getRoleId());	
		}
		/*TRoleExample roleExample = new TRoleExample();
		roleExample.createCriteria().andIsValidEqualTo(EnumBool.YES.getCode()).andRoleidIn(roleidList);
		
		List<>roleMapper.selectByExample(roleExample);*/
		
		RolePermissionExample rpExample = new RolePermissionExample();
		rpExample.createCriteria().andRoleIdIn(roleidList);
		List<RolePermission> rpList = rolePermissionMapper.selectByExample(rpExample);
		if (rpList.isEmpty()) {
			return ListUtils.EMPTY_LIST;
		}
		List<String> permissionIdList = new ArrayList<>();
		for (RolePermission tRolePermission : rpList) {
			permissionIdList.add(tRolePermission.getPermissionId());
		}
		
		PermissionExample permissionExample = new PermissionExample();
		permissionExample.createCriteria().andIsValidEqualTo(EnumBool.YES.getCode()).andPermissionIdIn(permissionIdList);
		return this.permissionMapper.selectByExample(permissionExample);
	}


}
