package com.yidu.base.allEntity;

import java.util.Date;
/**
 * 
 * TODO 对该类总结性的描述
 * 
 * @ClassName: Columns 
 * @author Administrator
 * @date 2018年8月29日 上午10:49:38
 * @version V1.0 
 *
 */
public class Columns {
	//专栏id
    private Integer columnId;
    //用户id
    private Integer userId;
    //标题
    private String columnTitle;
    //内容地址
    private String columnContentAddress;
    //专栏类型
    private String columnType;
    //专栏分类
    private String columnClassification;
    //收藏夹分类
    private Integer favoritesClassification;
    //是否可转发	(使用检查约束)1表示可以转发，2表示不可转发
    private String columnWhetherforwarded;
    //审核是否通过  1代表通过、2代表不通过，3代表审核中   (默认约束 3)
    private String audit;
    //标签
    private String label;
    //阅读数量
    private Integer readingNumber;
	//评论数量     
    private Integer commentsNumber;
	//喜欢数量
    private Integer likeNumber;
	//收藏数量
    private Integer collectionNumber;
	//创建时间
    private Date startTime;
	//最后修改时间
    private Date endTime;
    //专栏标题图	
    private String columnImgtitle;
   
    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle == null ? null : columnTitle.trim();
    }

    public String getColumnContentAddress() {
        return columnContentAddress;
    }

    public void setColumnContentAddress(String columnContentAddress) {
        this.columnContentAddress = columnContentAddress == null ? null : columnContentAddress.trim();
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    public String getColumnClassification() {
        return columnClassification;
    }

    public void setColumnClassification(String columnClassification) {
        this.columnClassification = columnClassification == null ? null : columnClassification.trim();
    }

    public Integer getFavoritesClassification() {
        return favoritesClassification=4;
    }

    public void setFavoritesClassification(Integer favoritesClassification) {
        this.favoritesClassification = favoritesClassification;
    }

    public String getColumnWhetherforwarded() {
        return columnWhetherforwarded;
    }

    public void setColumnWhetherforwarded(String columnWhetherforwarded) {
        this.columnWhetherforwarded = columnWhetherforwarded == null ? null : columnWhetherforwarded.trim();
    }

    public String getAudit() {
        return audit==null?"3":audit;
    }

    public void setAudit(String audit) {
        this.audit = audit == null ? null : audit.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getReadingNumber() {
        return readingNumber==null?0:commentsNumber;
    }

    public void setReadingNumber(Integer readingNumber) {
        this.readingNumber = readingNumber;
    }

    public Integer getCommentsNumber() {
        return commentsNumber==null?0:commentsNumber;
    }

    public void setCommentsNumber(Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public Integer getLikeNumber() {
        return likeNumber==null?0:likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getCollectionNumber() {
        return collectionNumber==null?0:collectionNumber;
    }

    public void setCollectionNumber(Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getColumnImgtitle() {
        return columnImgtitle;
    }

    public void setColumnImgtitle(String columnImgtitle) {
        this.columnImgtitle = columnImgtitle == null ? null : columnImgtitle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", columnId=").append(columnId);
        sb.append(", userId=").append(userId);
        sb.append(", columnTitle=").append(columnTitle);
        sb.append(", columnContentAddress=").append(columnContentAddress);
        sb.append(", columnType=").append(columnType);
        sb.append(", columnClassification=").append(columnClassification);
        sb.append(", favoritesClassification=").append(favoritesClassification);
        sb.append(", columnWhetherforwarded=").append(columnWhetherforwarded);
        sb.append(", audit=").append(audit);
        sb.append(", label=").append(label);
        sb.append(", readingNumber=").append(readingNumber);
        sb.append(", commentsNumber=").append(commentsNumber);
        sb.append(", likeNumber=").append(likeNumber);
        sb.append(", collectionNumber=").append(collectionNumber);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", columnImgtitle=").append(columnImgtitle);
        sb.append("]");
        return sb.toString();
    }
}