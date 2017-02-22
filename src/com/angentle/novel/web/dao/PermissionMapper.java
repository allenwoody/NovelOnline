package com.angentle.novel.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.angentle.novel.core.feature.orm.mybatis.Page;
import com.angentle.novel.core.generic.GenericDao;
import com.angentle.novel.web.model.Permission;
import com.angentle.novel.web.model.PermissionExample;

public interface PermissionMapper extends GenericDao<Permission, String>{
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(String permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    List<Permission> selectByExample(Page<Permission> page, PermissionExample example);
    
    Permission selectByPrimaryKey(String permissionId);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

}