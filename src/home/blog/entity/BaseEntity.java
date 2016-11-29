package home.blog.entity;

import java.util.Date;

import home.blog.util.Constants;

/**
 * BaseEntity
 * @author xialin
 */
public abstract class BaseEntity {
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

    protected void preNew() {
        Date now = new Date();
        this.setCreateDate(now);
        this.setUpdateDate(now);
        this.setIsDel(Constants.DEL_FLG_EXISTS);
    }

    protected void preUpdate() {
        Date now = new Date();
        this.setUpdateDate(now);
    }
}
