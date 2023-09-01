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


import com.dao.YuyuexinxiDao;
import com.entity.YuyuexinxiEntity;
import com.service.YuyuexinxiService;
import com.entity.vo.YuyuexinxiVO;
import com.entity.view.YuyuexinxiView;

@Service("yuyuexinxiService")
public class YuyuexinxiServiceImpl extends ServiceImpl<YuyuexinxiDao, YuyuexinxiEntity> implements YuyuexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuexinxiEntity> page = this.selectPage(
                new Query<YuyuexinxiEntity>(params).getPage(),
                new EntityWrapper<YuyuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuexinxiEntity> wrapper) {
		  Page<YuyuexinxiView> page =new Query<YuyuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuexinxiVO> selectListVO(Wrapper<YuyuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuexinxiVO selectVO(Wrapper<YuyuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuexinxiView> selectListView(Wrapper<YuyuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuexinxiView selectView(Wrapper<YuyuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
