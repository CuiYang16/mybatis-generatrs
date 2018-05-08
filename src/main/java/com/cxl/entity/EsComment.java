package com.cxl.entity;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EsComment {
    /**
     * 评论编号
     */
    private Integer id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评价等级 1~5 颗星星
     */
    private Integer level;

    /**
     * 是否匿名 0 匿名 1 显示用户名
     */
    private Integer isShowName;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 晒图 url
     */
    private String showimgs;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 0 删除 1未删除
     */
    private Integer isDelete;

    /**
     * 
     */
    private Integer userid;

    public EsComment(Integer id, String content, Integer level, Integer isShowName, Integer goodsId, String showimgs, Date createtime, Date updatetime, Integer isDelete, Integer userid) {
        this.id = id;
        this.content = content;
        this.level = level;
        this.isShowName = isShowName;
        this.goodsId = goodsId;
        this.showimgs = showimgs;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.isDelete = isDelete;
        this.userid = userid;
    }

    public EsComment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsShowName() {
        return isShowName;
    }

    public void setIsShowName(Integer isShowName) {
        this.isShowName = isShowName;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getShowimgs() {
        return showimgs;
    }

    public void setShowimgs(String showimgs) {
        this.showimgs = showimgs == null ? null : showimgs.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}