package com.gfl.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.gfl.platform.base.SuperEntity;

/**
 * <p>
 * 购物车商品详情
 * </p>
 *
 * @author Generator
 * @since 2017-12-11
 */
@TableName("co_cart_detail")
public class CoCartDetail extends SuperEntity<CoCartDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
	@TableId(value="co_cart_detail_id", type= IdType.AUTO)
	private Long coCartDetailId;
    /**
     * 购物车id
     */
	@TableField("co_cart_id")
	private Long coCartId;
    /**
     * 商户id
     */
	@TableField("ms_shop_id")
	private String msShopId;
    /**
     * 产品id(skuid)
     */
	@TableField("sp_item_id")
	private Long spItemId;
    /**
     * 产品属性Code
     */
	@TableField("sp_item_attribute_code")
	private Integer spItemAttributeCode;
    /**
     * 购买单位
     */
	private Integer unit;
    /**
     * 标志
     */
	private String flag;
    /**
     * 状态
     */
	private Integer status;
    /**
     * 类型
     */
	private Integer types;
    /**
     * 创建人
     */
	private String creator;
    /**
     * 创建时间
     */
	@TableField("created_at")
	private Date createdAt;
    /**
     * 最后更新时间
     */
	@TableField("last_update_time")
	private Date lastUpdateTime;
    /**
     * 最后更新人id
     */
	@TableField("last_updator_id")
	private String lastUpdatorId;
    /**
     * 最后更新人名称
     */
	@TableField("last_updator_name")
	private String lastUpdatorName;
    /**
     * 是否已删除
     */
	@TableField("is_delete")
	private Integer isDelete;
    /**
     * 版本号
     */
	private Integer versionid;


	public Long getCoCartDetailId() {
		return coCartDetailId;
	}

	public void setCoCartDetailId(Long coCartDetailId) {
		this.coCartDetailId = coCartDetailId;
	}

	public Long getCoCartId() {
		return coCartId;
	}

	public void setCoCartId(Long coCartId) {
		this.coCartId = coCartId;
	}

	public String getMsShopId() {
		return msShopId;
	}

	public void setMsShopId(String msShopId) {
		this.msShopId = msShopId;
	}

	public Long getSpItemId() {
		return spItemId;
	}

	public void setSpItemId(Long spItemId) {
		this.spItemId = spItemId;
	}

	public Integer getSpItemAttributeCode() {
		return spItemAttributeCode;
	}

	public void setSpItemAttributeCode(Integer spItemAttributeCode) {
		this.spItemAttributeCode = spItemAttributeCode;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTypes() {
		return types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getLastUpdatorId() {
		return lastUpdatorId;
	}

	public void setLastUpdatorId(String lastUpdatorId) {
		this.lastUpdatorId = lastUpdatorId;
	}

	public String getLastUpdatorName() {
		return lastUpdatorName;
	}

	public void setLastUpdatorName(String lastUpdatorName) {
		this.lastUpdatorName = lastUpdatorName;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getVersionid() {
		return versionid;
	}

	public void setVersionid(Integer versionid) {
		this.versionid = versionid;
	}

	@Override
	protected Serializable pkVal() {
		return this.coCartDetailId;
	}

	@Override
	public String toString() {
		return "CoCartDetail{" +
			", coCartDetailId=" + coCartDetailId +
			", coCartId=" + coCartId +
			", msShopId=" + msShopId +
			", spItemId=" + spItemId +
			", spItemAttributeCode=" + spItemAttributeCode +
			", unit=" + unit +
			", flag=" + flag +
			", status=" + status +
			", types=" + types +
			", creator=" + creator +
			", createdAt=" + createdAt +
			", lastUpdateTime=" + lastUpdateTime +
			", lastUpdatorId=" + lastUpdatorId +
			", lastUpdatorName=" + lastUpdatorName +
			", isDelete=" + isDelete +
			", versionid=" + versionid +
			"}";
	}
}
