package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuexinxiView;


/**
 * 预约信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface YuyuexinxiService extends IService<YuyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuexinxiVO> selectListVO(Wrapper<YuyuexinxiEntity> wrapper);
   	
   	YuyuexinxiVO selectVO(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
   	
   	List<YuyuexinxiView> selectListView(Wrapper<YuyuexinxiEntity> wrapper);
   	
   	YuyuexinxiView selectView(@Param("ew") Wrapper<YuyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuexinxiEntity> wrapper);
   	

}

