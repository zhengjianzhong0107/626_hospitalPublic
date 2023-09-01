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


import com.dao.JianchabaogaoDao;
import com.entity.JianchabaogaoEntity;
import com.service.JianchabaogaoService;
import com.entity.vo.JianchabaogaoVO;
import com.entity.view.JianchabaogaoView;

@Service("jianchabaogaoService")
public class JianchabaogaoServiceImpl extends ServiceImpl<JianchabaogaoDao, JianchabaogaoEntity> implements JianchabaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianchabaogaoEntity> page = this.selectPage(
                new Query<JianchabaogaoEntity>(params).getPage(),
                new EntityWrapper<JianchabaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianchabaogaoEntity> wrapper) {
		  Page<JianchabaogaoView> page =new Query<JianchabaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianchabaogaoVO> selectListVO(Wrapper<JianchabaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianchabaogaoVO selectVO(Wrapper<JianchabaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianchabaogaoView> selectListView(Wrapper<JianchabaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianchabaogaoView selectView(Wrapper<JianchabaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
