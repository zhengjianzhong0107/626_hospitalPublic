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


import com.dao.XiangmufenleiDao;
import com.entity.XiangmufenleiEntity;
import com.service.XiangmufenleiService;
import com.entity.vo.XiangmufenleiVO;
import com.entity.view.XiangmufenleiView;

@Service("xiangmufenleiService")
public class XiangmufenleiServiceImpl extends ServiceImpl<XiangmufenleiDao, XiangmufenleiEntity> implements XiangmufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmufenleiEntity> page = this.selectPage(
                new Query<XiangmufenleiEntity>(params).getPage(),
                new EntityWrapper<XiangmufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmufenleiEntity> wrapper) {
		  Page<XiangmufenleiView> page =new Query<XiangmufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmufenleiVO> selectListVO(Wrapper<XiangmufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmufenleiVO selectVO(Wrapper<XiangmufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmufenleiView> selectListView(Wrapper<XiangmufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmufenleiView selectView(Wrapper<XiangmufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
