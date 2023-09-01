package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianchabaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianchabaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianchabaogaoView;


/**
 * 检查报告
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface JianchabaogaoService extends IService<JianchabaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianchabaogaoVO> selectListVO(Wrapper<JianchabaogaoEntity> wrapper);
   	
   	JianchabaogaoVO selectVO(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
   	
   	List<JianchabaogaoView> selectListView(Wrapper<JianchabaogaoEntity> wrapper);
   	
   	JianchabaogaoView selectView(@Param("ew") Wrapper<JianchabaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianchabaogaoEntity> wrapper);
   	

}

