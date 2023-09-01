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
 * 项目信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 20:18:07
 */
@TableName("xiangmuxinxi")
public class XiangmuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmuxinxiEntity() {
		
	}
	
	public XiangmuxinxiEntity(T t) {
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
	 * 项目编号
	 */
					
	private String xiangmubianhao;
	
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 项目分类
	 */
					
	private String xiangmufenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 费用
	 */
					
	private Integer feiyong;
	
	/**
	 * 项目介绍
	 */
					
	private String xiangmujieshao;
	
	/**
	 * 项目位置
	 */
					
	private String xiangmuweizhi;
	
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
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
	 * 设置：项目编号
	 */
	public void setXiangmubianhao(String xiangmubianhao) {
		this.xiangmubianhao = xiangmubianhao;
	}
	/**
	 * 获取：项目编号
	 */
	public String getXiangmubianhao() {
		return xiangmubianhao;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：项目分类
	 */
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：费用
	 */
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
	/**
	 * 设置：项目介绍
	 */
	public void setXiangmujieshao(String xiangmujieshao) {
		this.xiangmujieshao = xiangmujieshao;
	}
	/**
	 * 获取：项目介绍
	 */
	public String getXiangmujieshao() {
		return xiangmujieshao;
	}
	/**
	 * 设置：项目位置
	 */
	public void setXiangmuweizhi(String xiangmuweizhi) {
		this.xiangmuweizhi = xiangmuweizhi;
	}
	/**
	 * 获取：项目位置
	 */
	public String getXiangmuweizhi() {
		return xiangmuweizhi;
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

}
