package com.dao;

import com.entity.XiangmufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmufenleiVO;
import com.entity.view.XiangmufenleiView;


/**
 * 项目分类
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:18:07
 */
public interface XiangmufenleiDao extends BaseMapper<XiangmufenleiEntity> {
	
	List<XiangmufenleiVO> selectListVO(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
	
	XiangmufenleiVO selectVO(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
	
	List<XiangmufenleiView> selectListView(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);

	List<XiangmufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
	
	XiangmufenleiView selectView(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
	

}
