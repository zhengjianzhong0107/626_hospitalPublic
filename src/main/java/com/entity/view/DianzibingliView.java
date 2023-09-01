package com.entity.view;

import com.entity.DianzibingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电子病例
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
@TableName("dianzibingli")
public class DianzibingliView  extends DianzibingliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianzibingliView(){
	}
 
 	public DianzibingliView(DianzibingliEntity dianzibingliEntity){
 	try {
			BeanUtils.copyProperties(this, dianzibingliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
