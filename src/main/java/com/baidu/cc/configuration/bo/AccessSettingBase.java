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
 * This bo is map to table : access_setting Table description : .
 * 
 * @author BJF
 */
public abstract class AccessSettingBase extends FieldAccessVo implements
        TableDataConvertable, Serializable {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.user_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.ref_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REFID = "refId";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.type
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.create_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_ID = "主键";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.user_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_USERID = "用户id";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.ref_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_REFID = "引用id，由type类型决定。";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.type
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_TYPE = "引用类型";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.create_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

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
     * the database column access_setting.id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.user_id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.ref_id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REFID)
    private Long refId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.type
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private Byte type;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column access_setting.create_time
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column access_setting.id
     * 
     * @return the value of access_setting.id
     * 
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column access_setting.id
     * 
     * @param id
     *            the value for access_setting.id
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
     * value of the database column access_setting.user_id
     * 
     * @return the value of access_setting.user_id
     * 
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column access_setting.user_id
     * 
     * @param userId
     *            the value for access_setting.user_id
     * 
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        if (!ObjectUtils.equals(userId, this.userId)) {
            getChangeLogInfo().put(PROPERTY_USERID, userId);
        }
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column access_setting.ref_id
     * 
     * @return the value of access_setting.ref_id
     * 
     * @mbggenerated
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column access_setting.ref_id
     * 
     * @param refId
     *            the value for access_setting.ref_id
     * 
     * @mbggenerated
     */
    public void setRefId(Long refId) {
        if (!ObjectUtils.equals(refId, this.refId)) {
            getChangeLogInfo().put(PROPERTY_REFID, refId);
        }
        this.refId = refId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column access_setting.type
     * 
     * @return the value of access_setting.type
     * 
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column access_setting.type
     * 
     * @param type
     *            the value for access_setting.type
     * 
     * @mbggenerated
     */
    public void setType(Byte type) {
        if (!ObjectUtils.equals(type, this.type)) {
            getChangeLogInfo().put(PROPERTY_TYPE, type);
        }
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column access_setting.create_time
     * 
     * @return the value of access_setting.create_time
     * 
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column access_setting.create_time
     * 
     * @param createTime
     *            the value for access_setting.create_time
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
     * get table fields.
     * 
     * @return list of TableField
     */
    public List<TableField> getTableFieds() {
        List<TableField> list = new ArrayList<TableField>(5);
        TableField tf;
        tf = new TableField(PROPERTY_REMARK_ID, PROPERTY_ID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_USERID, PROPERTY_USERID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_REFID, PROPERTY_REFID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_TYPE, PROPERTY_TYPE);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_CREATETIME, PROPERTY_CREATETIME);
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
        map.put(PROPERTY_USERID, userId);
        map.put(PROPERTY_REFID, refId);
        map.put(PROPERTY_TYPE, type);
        map.put(PROPERTY_CREATETIME,
                DateUtils.formatDate(createTime, DateUtils.DEFAULT_PATTERN));
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
        map.put(PROPERTY_USERID, userId);
        map.put(PROPERTY_REFID, refId);
        map.put(PROPERTY_TYPE, type);
        map.put(PROPERTY_CREATETIME, createTime);
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
        if (!(aThat instanceof AccessSettingBase)) {
            return false;
        }

        final AccessSettingBase THAT = (AccessSettingBase) aThat;
        boolean result = true;
        result = result
                && (((this.getId() == null) && (THAT.getId() == null)) || (this
                        .getId() != null && this.getId().equals(THAT.getId())));
        return result;
    }
}