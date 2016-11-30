package home.blog.dto;

import java.util.Date;

/**
 * BaseEntity
 * @author xialin
 */
public abstract class BaseDto {
    // 0:not deleted 1:deleted
    private int isDel;

    private Date createDate;

    private Date updateDate;

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
