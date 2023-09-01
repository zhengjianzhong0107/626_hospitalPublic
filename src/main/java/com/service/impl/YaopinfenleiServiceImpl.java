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


import com.dao.YaopinfenleiDao;
import com.entity.YaopinfenleiEntity;
import com.service.YaopinfenleiService;
import com.entity.vo.YaopinfenleiVO;
import com.entity.view.YaopinfenleiView;

@Service("yaopinfenleiService")
public class YaopinfenleiServiceImpl extends ServiceImpl<YaopinfenleiDao, YaopinfenleiEntity> implements YaopinfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinfenleiEntity> page = this.selectPage(
                new Query<YaopinfenleiEntity>(params).getPage(),
                new EntityWrapper<YaopinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinfenleiEntity> wrapper) {
		  Page<YaopinfenleiView> page =new Query<YaopinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinfenleiVO> selectListVO(Wrapper<YaopinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinfenleiVO selectVO(Wrapper<YaopinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinfenleiView> selectListView(Wrapper<YaopinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinfenleiView selectView(Wrapper<YaopinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
