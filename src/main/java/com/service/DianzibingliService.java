package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzibingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzibingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzibingliView;


/**
 * 电子病例
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
public interface DianzibingliService extends IService<DianzibingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzibingliVO> selectListVO(Wrapper<DianzibingliEntity> wrapper);
   	
   	DianzibingliVO selectVO(@Param("ew") Wrapper<DianzibingliEntity> wrapper);
   	
   	List<DianzibingliView> selectListView(Wrapper<DianzibingliEntity> wrapper);
   	
   	DianzibingliView selectView(@Param("ew") Wrapper<DianzibingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzibingliEntity> wrapper);
   	

}

