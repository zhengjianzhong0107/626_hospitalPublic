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


import com.dao.XiangmuxinxiDao;
import com.entity.XiangmuxinxiEntity;
import com.service.XiangmuxinxiService;
import com.entity.vo.XiangmuxinxiVO;
import com.entity.view.XiangmuxinxiView;

@Service("xiangmuxinxiService")
public class XiangmuxinxiServiceImpl extends ServiceImpl<XiangmuxinxiDao, XiangmuxinxiEntity> implements XiangmuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuxinxiEntity> page = this.selectPage(
                new Query<XiangmuxinxiEntity>(params).getPage(),
                new EntityWrapper<XiangmuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuxinxiEntity> wrapper) {
		  Page<XiangmuxinxiView> page =new Query<XiangmuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuxinxiVO> selectListVO(Wrapper<XiangmuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuxinxiVO selectVO(Wrapper<XiangmuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuxinxiView> selectListView(Wrapper<XiangmuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuxinxiView selectView(Wrapper<XiangmuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
