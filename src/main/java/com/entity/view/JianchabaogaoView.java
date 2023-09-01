package com.entity.view;

import com.entity.JianchabaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检查报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
@TableName("jianchabaogao")
public class JianchabaogaoView  extends JianchabaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianchabaogaoView(){
	}
 
 	public JianchabaogaoView(JianchabaogaoEntity jianchabaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, jianchabaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
