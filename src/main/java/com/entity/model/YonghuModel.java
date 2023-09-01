package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 20:18:07
 */
public class YonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 电话号码
	 */
	
	private String dianhuahaoma;
		
	/**
	 * 紧急联系人
	 */
	
	private String jinjilianxiren;
		
	/**
	 * 血型
	 */
	
	private String xuexing;
		
	/**
	 * 禁忌
	 */
	
	private String jinji;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：电话号码
	 */
	 
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
				
	
	/**
	 * 设置：紧急联系人
	 */
	 
	public void setJinjilianxiren(String jinjilianxiren) {
		this.jinjilianxiren = jinjilianxiren;
	}
	
	/**
	 * 获取：紧急联系人
	 */
	public String getJinjilianxiren() {
		return jinjilianxiren;
	}
				
	
	/**
	 * 设置：血型
	 */
	 
	public void setXuexing(String xuexing) {
		this.xuexing = xuexing;
	}
	
	/**
	 * 获取：血型
	 */
	public String getXuexing() {
		return xuexing;
	}
				
	
	/**
	 * 设置：禁忌
	 */
	 
	public void setJinji(String jinji) {
		this.jinji = jinji;
	}
	
	/**
	 * 获取：禁忌
	 */
	public String getJinji() {
		return jinji;
	}
			
}
