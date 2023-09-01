package com.dao;

import com.entity.DianzibingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzibingliVO;
import com.entity.view.DianzibingliView;


/**
 * 电子病例
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface DianzibingliDao extends BaseMapper<DianzibingliEntity> {
	
	List<DianzibingliVO> selectListVO(@Param("ew") Wrapper<DianzibingliEntity> wrapper);
	
	DianzibingliVO selectVO(@Param("ew") Wrapper<DianzibingliEntity> wrapper);
	
	List<DianzibingliView> selectListView(@Param("ew") Wrapper<DianzibingliEntity> wrapper);

	List<DianzibingliView> selectListView(Pagination page,@Param("ew") Wrapper<DianzibingliEntity> wrapper);
	
	DianzibingliView selectView(@Param("ew") Wrapper<DianzibingliEntity> wrapper);
	

}
