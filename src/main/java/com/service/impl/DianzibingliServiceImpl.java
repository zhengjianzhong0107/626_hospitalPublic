package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianzibingliDao;
import com.entity.DianzibingliEntity;
import com.service.DianzibingliService;
import com.entity.vo.DianzibingliVO;
import com.entity.view.DianzibingliView;

@Service("dianzibingliService")
public class DianzibingliServiceImpl extends ServiceImpl<DianzibingliDao, DianzibingliEntity> implements DianzibingliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzibingliEntity> page = this.selectPage(
                new Query<DianzibingliEntity>(params).getPage(),
                new EntityWrapper<DianzibingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzibingliEntity> wrapper) {
		  Page<DianzibingliView> page =new Query<DianzibingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzibingliVO> selectListVO(Wrapper<DianzibingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzibingliVO selectVO(Wrapper<DianzibingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzibingliView> selectListView(Wrapper<DianzibingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzibingliView selectView(Wrapper<DianzibingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
