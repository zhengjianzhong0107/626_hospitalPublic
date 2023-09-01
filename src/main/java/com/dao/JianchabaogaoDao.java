package com.dao;

import com.entity.JianchabaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianchabaogaoVO;
import com.entity.view.JianchabaogaoView;


/**
 * 检查报告
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface JianchabaogaoDao extends BaseMapper<JianchabaogaoEntity> {
	
	List<JianchabaogaoVO> selectListVO(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
	
	JianchabaogaoVO selectVO(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
	
	List<JianchabaogaoView> selectListView(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);

	List<JianchabaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
	
	JianchabaogaoView selectView(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
	

}
