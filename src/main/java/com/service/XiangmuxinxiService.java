package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuxinxiView;


/**
 * 项目信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:18:07
 */
public interface XiangmuxinxiService extends IService<XiangmuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuxinxiVO> selectListVO(Wrapper<XiangmuxinxiEntity> wrapper);
   	
   	XiangmuxinxiVO selectVO(@Param("ew") Wrapper<XiangmuxinxiEntity> wrapper);
   	
   	List<XiangmuxinxiView> selectListView(Wrapper<XiangmuxinxiEntity> wrapper);
   	
   	XiangmuxinxiView selectView(@Param("ew") Wrapper<XiangmuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuxinxiEntity> wrapper);
   	

}

