/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.cc.configuration.bo;

import com.baidu.bjf.dao.ColumnDescription;
import com.baidu.bjf.dao.FieldAccessVo;
import com.baidu.bjf.dao.Id;
import com.baidu.lego.web.spi.component.TableDataConvertable;
import com.baidu.lego.web.spi.component.TableField;
import com.baidu.rigel.platform.util.DateUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang.ObjectUtils;

/**
 * This bo is map to table : cc_user Table description : .
 * 
 * @author BJF
 */
public abstract class UserBase extends FieldAccessVo implements
        TableDataConvertable, Serializable {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.name
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.password
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_PASSWORD = "password";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.api_password
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_APIPASSWORD = "apiPassword";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.create_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.update_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_UPDATETIME = "updateTime";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.status
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_ID = "主键";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.name
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_NAME = "用户名";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.password
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_PASSWORD = "操作台登录密码";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.api_password
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_APIPASSWORD = "api访问密码";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.create_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.update_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_UPDATETIME = "修改时间";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.status
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_STATUS = "状态0正常";

    /** serial Version UID. */
    private static final long serialVersionUID = -1L;

    /** hashCode temporary storage. */
    private volatile Long hashCode;

    /**
     * Use a WeakHashMap so entries will be garbage collected once all entities
     * referring to a saved hash are garbage collected themselves.
     */
    private static final Map<Serializable, Long> SAVED_HASHES = Collections
            .synchronizedMap(new WeakHashMap<Serializable, Long>());

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.name
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.password
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PASSWORD)
    private String password;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.api_password
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_APIPASSWORD)
    private String apiPassword;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.create_time
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.update_time
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPDATETIME)
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column cc_user.status
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Byte status;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.id
     * 
     * @return the value of cc_user.id
     * 
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.id
     * 
     * @param id
     *            the value for cc_user.id
     * 
     * @mbggenerated
     */
    public void setId(Long id) {
        // If we've just been persisted and hashCode has been
        // returned then make sure other entities with this
        // ID return the already returned hash code
        if (this.id == null && id != null && this.hashCode != null) {
            SAVED_HASHES.put(id, this.hashCode);
        }
        if (!ObjectUtils.equals(id, this.id)) {
            getChangeLogInfo().put(PROPERTY_ID, id);
        }
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.name
     * 
     * @return the value of cc_user.name
     * 
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.name
     * 
     * @param name
     *            the value for cc_user.name
     * 
     * @mbggenerated
     */
    public void setName(String name) {
        if (!ObjectUtils.equals(name, this.name)) {
            getChangeLogInfo().put(PROPERTY_NAME, name);
        }
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.password
     * 
     * @return the value of cc_user.password
     * 
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.password
     * 
     * @param password
     *            the value for cc_user.password
     * 
     * @mbggenerated
     */
    public void setPassword(String password) {
        if (!ObjectUtils.equals(password, this.password)) {
            getChangeLogInfo().put(PROPERTY_PASSWORD, password);
        }
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.api_password
     * 
     * @return the value of cc_user.api_password
     * 
     * @mbggenerated
     */
    public String getApiPassword() {
        return apiPassword;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.api_password
     * 
     * @param apiPassword
     *            the value for cc_user.api_password
     * 
     * @mbggenerated
     */
    public void setApiPassword(String apiPassword) {
        if (!ObjectUtils.equals(apiPassword, this.apiPassword)) {
            getChangeLogInfo().put(PROPERTY_APIPASSWORD, apiPassword);
        }
        this.apiPassword = apiPassword;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.create_time
     * 
     * @return the value of cc_user.create_time
     * 
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.create_time
     * 
     * @param createTime
     *            the value for cc_user.create_time
     * 
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        if (!ObjectUtils.equals(createTime, this.createTime)) {
            getChangeLogInfo().put(PROPERTY_CREATETIME, createTime);
        }
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.update_time
     * 
     * @return the value of cc_user.update_time
     * 
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.update_time
     * 
     * @param updateTime
     *            the value for cc_user.update_time
     * 
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        if (!ObjectUtils.equals(updateTime, this.updateTime)) {
            getChangeLogInfo().put(PROPERTY_UPDATETIME, updateTime);
        }
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column cc_user.status
     * 
     * @return the value of cc_user.status
     * 
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column cc_user.status
     * 
     * @param status
     *            the value for cc_user.status
     * 
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        if (!ObjectUtils.equals(status, this.status)) {
            getChangeLogInfo().put(PROPERTY_STATUS, status);
        }
        this.status = status;
    }

    /**
     * get table fields.
     * 
     * @return list of TableField
     */
    public List<TableField> getTableFieds() {
        List<TableField> list = new ArrayList<TableField>(7);
        TableField tf;
        tf = new TableField(PROPERTY_REMARK_ID, PROPERTY_ID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_NAME, PROPERTY_NAME);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_PASSWORD, PROPERTY_PASSWORD);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_APIPASSWORD, PROPERTY_APIPASSWORD);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_CREATETIME, PROPERTY_CREATETIME);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_UPDATETIME, PROPERTY_UPDATETIME);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_STATUS, PROPERTY_STATUS);
        list.add(tf);
        return list;
    }

    /**
     * get table values.
     * 
     * @return Map
     */
    public Map<String, Object> getTableValue() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(PROPERTY_ID, id);
        map.put(PROPERTY_NAME, name);
        map.put(PROPERTY_PASSWORD, password);
        map.put(PROPERTY_APIPASSWORD, apiPassword);
        map.put(PROPERTY_CREATETIME,
                DateUtils.formatDate(createTime, DateUtils.DEFAULT_PATTERN));
        map.put(PROPERTY_UPDATETIME,
                DateUtils.formatDate(updateTime, DateUtils.DEFAULT_PATTERN));
        map.put(PROPERTY_STATUS, status);
        return map;
    }

    /**
     * get map key is field name, value is field value.
     * 
     * @return Map
     */
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(PROPERTY_ID, id);
        map.put(PROPERTY_NAME, name);
        map.put(PROPERTY_PASSWORD, password);
        map.put(PROPERTY_APIPASSWORD, apiPassword);
        map.put(PROPERTY_CREATETIME, createTime);
        map.put(PROPERTY_UPDATETIME, updateTime);
        map.put(PROPERTY_STATUS, status);
        return map;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        if (this.hashCode == null) {
            synchronized (this) {
                if (this.hashCode == null) {
                    Long newHashCode = null;
                    if (getId() != null) {
                        newHashCode = SAVED_HASHES.get(getId());
                    }

                    if (newHashCode == null) {
                        if (getId() != null) {
                            newHashCode = (long) getId().hashCode();
                        } else {
                            newHashCode = (long) super.hashCode();
                        }
                    }
                    this.hashCode = newHashCode;
                }
            }
        }
        return (int) (this.hashCode & 0xffffff);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object aThat) {

        if (this == aThat) {
            return true;
        }
        if (aThat == null) {
            return false;
        }
        if (!(aThat instanceof UserBase)) {
            return false;
        }

        final UserBase THAT = (UserBase) aThat;
        boolean result = true;
        result = result
                && (((this.getId() == null) && (THAT.getId() == null)) || (this
                        .getId() != null && this.getId().equals(THAT.getId())));
        return result;
    }
}