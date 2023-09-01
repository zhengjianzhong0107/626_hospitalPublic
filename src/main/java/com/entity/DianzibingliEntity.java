package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电子病例
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 20:18:08
 */
@TableName("dianzibingli")
public class DianzibingliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianzibingliEntity() {
		
	}
	
	public DianzibingliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病例编号
	 */
					
	private String binglibianhao;
	
	/**
	 * 病情详述
	 */
					
	private String bingqingxiangshu;
	
	/**
	 * 检查诊断
	 */
					
	private String jianchazhenduan;
	
	/**
	 * 症状
	 */
					
	private String zhengzhuang;
	
	/**
	 * 制定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhidingshijian;
	
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病例编号
	 */
	public void setBinglibianhao(String binglibianhao) {
		this.binglibianhao = binglibianhao;
	}
	/**
	 * 获取：病例编号
	 */
	public String getBinglibianhao() {
		return binglibianhao;
	}
	/**
	 * 设置：病情详述
	 */
	public void setBingqingxiangshu(String bingqingxiangshu) {
		this.bingqingxiangshu = bingqingxiangshu;
	}
	/**
	 * 获取：病情详述
	 */
	public String getBingqingxiangshu() {
		return bingqingxiangshu;
	}
	/**
	 * 设置：检查诊断
	 */
	public void setJianchazhenduan(String jianchazhenduan) {
		this.jianchazhenduan = jianchazhenduan;
	}
	/**
	 * 获取：检查诊断
	 */
	public String getJianchazhenduan() {
		return jianchazhenduan;
	}
	/**
	 * 设置：症状
	 */
	public void setZhengzhuang(String zhengzhuang) {
		this.zhengzhuang = zhengzhuang;
	}
	/**
	 * 获取：症状
	 */
	public String getZhengzhuang() {
		return zhengzhuang;
	}
	/**
	 * 设置：制定时间
	 */
	public void setZhidingshijian(Date zhidingshijian) {
		this.zhidingshijian = zhidingshijian;
	}
	/**
	 * 获取：制定时间
	 */
	public Date getZhidingshijian() {
		return zhidingshijian;
	}
	/**
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
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

}
