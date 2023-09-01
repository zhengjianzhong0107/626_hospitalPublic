package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DianzibingliEntity;
import com.entity.view.DianzibingliView;

import com.service.DianzibingliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 电子病例
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
@RestController
@RequestMapping("/dianzibingli")
public class DianzibingliController {
    @Autowired
    private DianzibingliService dianzibingliService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianzibingliEntity dianzibingli, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			dianzibingli.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			dianzibingli.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianzibingliEntity> ew = new EntityWrapper<DianzibingliEntity>();
		PageUtils page = dianzibingliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianzibingli), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianzibingliEntity dianzibingli, 
		HttpServletRequest request){
        EntityWrapper<DianzibingliEntity> ew = new EntityWrapper<DianzibingliEntity>();
		PageUtils page = dianzibingliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianzibingli), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianzibingliEntity dianzibingli){
       	EntityWrapper<DianzibingliEntity> ew = new EntityWrapper<DianzibingliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianzibingli, "dianzibingli")); 
        return R.ok().put("data", dianzibingliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianzibingliEntity dianzibingli){
        EntityWrapper< DianzibingliEntity> ew = new EntityWrapper< DianzibingliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianzibingli, "dianzibingli")); 
		DianzibingliView dianzibingliView =  dianzibingliService.selectView(ew);
		return R.ok("查询电子病例成功").put("data", dianzibingliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianzibingliEntity dianzibingli = dianzibingliService.selectById(id);
        return R.ok().put("data", dianzibingli);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianzibingliEntity dianzibingli = dianzibingliService.selectById(id);
        return R.ok().put("data", dianzibingli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianzibingliEntity dianzibingli, HttpServletRequest request){
    	dianzibingli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianzibingli);

        dianzibingliService.insert(dianzibingli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianzibingliEntity dianzibingli, HttpServletRequest request){
    	dianzibingli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianzibingli);

        dianzibingliService.insert(dianzibingli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DianzibingliEntity dianzibingli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianzibingli);
        dianzibingliService.updateById(dianzibingli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianzibingliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DianzibingliEntity> wrapper = new EntityWrapper<DianzibingliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishenggonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dianzibingliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
