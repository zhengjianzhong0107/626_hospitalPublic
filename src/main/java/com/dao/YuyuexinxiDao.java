package com.dao;

import com.entity.YuyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuexinxiVO;
import com.entity.view.YuyuexinxiView;


/**
 * 预约信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface YuyuexinxiDao extends BaseMapper<YuyuexinxiEntity> {
	
	List<YuyuexinxiVO> selectListVO(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
	
	YuyuexinxiVO selectVO(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
	
	List<YuyuexinxiView> selectListView(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);

	List<YuyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
	
	YuyuexinxiView selectView(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
	

}
