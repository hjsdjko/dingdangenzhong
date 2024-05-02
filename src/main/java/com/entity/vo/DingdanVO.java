package com.entity.vo;

import com.entity.DingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-22
 */
@TableName("dingdan")
public class DingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单编号
     */

    @TableField(value = "dingdan_bianhao")
    private String dingdanBianhao;


    /**
     * 客户名称
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 定制品名称
     */

    @TableField(value = "dingdan_name")
    private String dingdanName;


    /**
     * 订购数量
     */

    @TableField(value = "dingdan_number")
    private Integer dingdanNumber;


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "dingdan_time")
    private Date dingdanTime;


    /**
     * 订单总额
     */

    @TableField(value = "dingdan_money")
    private Double dingdanMoney;


    /**
     * 订单状态
     */

    @TableField(value = "dingdan_types")
    private Integer dingdanTypes;


    /**
     * 备注
     */

    @TableField(value = "youxigonglue_content")
    private String youxigonglueContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单编号
	 */
    public String getDingdanBianhao() {
        return dingdanBianhao;
    }


    /**
	 * 获取：订单编号
	 */

    public void setDingdanBianhao(String dingdanBianhao) {
        this.dingdanBianhao = dingdanBianhao;
    }
    /**
	 * 设置：客户名称
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：客户名称
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：定制品名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 获取：定制品名称
	 */

    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 设置：订购数量
	 */
    public Integer getDingdanNumber() {
        return dingdanNumber;
    }


    /**
	 * 获取：订购数量
	 */

    public void setDingdanNumber(Integer dingdanNumber) {
        this.dingdanNumber = dingdanNumber;
    }
    /**
	 * 设置：签订时间
	 */
    public Date getDingdanTime() {
        return dingdanTime;
    }


    /**
	 * 获取：签订时间
	 */

    public void setDingdanTime(Date dingdanTime) {
        this.dingdanTime = dingdanTime;
    }
    /**
	 * 设置：订单总额
	 */
    public Double getDingdanMoney() {
        return dingdanMoney;
    }


    /**
	 * 获取：订单总额
	 */

    public void setDingdanMoney(Double dingdanMoney) {
        this.dingdanMoney = dingdanMoney;
    }
    /**
	 * 设置：订单状态
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }


    /**
	 * 获取：订单状态
	 */

    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 获取：备注
	 */

    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
