package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmufenleiView;


/**
 * 项目分类
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:18:07
 */
public interface XiangmufenleiService extends IService<XiangmufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmufenleiVO> selectListVO(Wrapper<XiangmufenleiEntity> wrapper);
   	
   	XiangmufenleiVO selectVO(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
   	
   	List<XiangmufenleiView> selectListView(Wrapper<XiangmufenleiEntity> wrapper);
   	
   	XiangmufenleiView selectView(@Param("ew") Wrapper<XiangmufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmufenleiEntity> wrapper);
   	

}

