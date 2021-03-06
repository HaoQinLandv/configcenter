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
 * This bo is map to table : version Table description : null.
 * 
 * @author BJF
 */
public abstract class VersionBase extends FieldAccessVo implements
        TableDataConvertable, Serializable {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.name
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.memo
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_MEMO = "memo";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_CHECKSUM = "checkSum";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.create_chck_sum
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_CREATECHCKSUM = "createChckSum";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.update_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_UPDATETIME = "updateTime";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum_date
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_CHECKSUMDATE = "checkSumDate";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.project_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_PROJECTID = "projectId";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.environment_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_ENVIRONMENTID = "environmentId";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_ID = "主键";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.name
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_NAME = "版本名称";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.memo
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_MEMO = "备注";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_CHECKSUM = "更新标识，由该标识识别是否有配置更新";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.create_chck_sum
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_CREATECHCKSUM = "是否运行check检查。1表示需要检查";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.update_time
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_UPDATETIME = "该版本下配置项的最后更新时间";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum_date
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_CHECKSUMDATE = "版本检查编号对应的update时间";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.project_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_PROJECTID = "工程id";

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.environment_id
     * 
     * @mbggenerated
     */
    private static final String PROPERTY_REMARK_ENVIRONMENTID = "运行环境id";

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
     * the database column version.id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.name
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.memo
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MEMO)
    private String memo;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CHECKSUM)
    private String checkSum;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.create_chck_sum
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATECHCKSUM)
    private Boolean createChckSum;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.update_time
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPDATETIME)
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.check_sum_date
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CHECKSUMDATE)
    private Date checkSumDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.project_id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PROJECTID)
    private Long projectId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column version.environment_id
     * 
     * @mbggenerated
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ENVIRONMENTID)
    private Long environmentId;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.id
     * 
     * @return the value of version.id
     * 
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.id
     * 
     * @param id
     *            the value for version.id
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
     * value of the database column version.name
     * 
     * @return the value of version.name
     * 
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.name
     * 
     * @param name
     *            the value for version.name
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
     * value of the database column version.memo
     * 
     * @return the value of version.memo
     * 
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.memo
     * 
     * @param memo
     *            the value for version.memo
     * 
     * @mbggenerated
     */
    public void setMemo(String memo) {
        if (!ObjectUtils.equals(memo, this.memo)) {
            getChangeLogInfo().put(PROPERTY_MEMO, memo);
        }
        this.memo = memo;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.check_sum
     * 
     * @return the value of version.check_sum
     * 
     * @mbggenerated
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.check_sum
     * 
     * @param checkSum
     *            the value for version.check_sum
     * 
     * @mbggenerated
     */
    public void setCheckSum(String checkSum) {
        if (!ObjectUtils.equals(checkSum, this.checkSum)) {
            getChangeLogInfo().put(PROPERTY_CHECKSUM, checkSum);
        }
        this.checkSum = checkSum;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.create_chck_sum
     * 
     * @return the value of version.create_chck_sum
     * 
     * @mbggenerated
     */
    public Boolean getCreateChckSum() {
        return createChckSum;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.create_chck_sum
     * 
     * @param createChckSum
     *            the value for version.create_chck_sum
     * 
     * @mbggenerated
     */
    public void setCreateChckSum(Boolean createChckSum) {
        if (!ObjectUtils.equals(createChckSum, this.createChckSum)) {
            getChangeLogInfo().put(PROPERTY_CREATECHCKSUM, createChckSum);
        }
        this.createChckSum = createChckSum;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.update_time
     * 
     * @return the value of version.update_time
     * 
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.update_time
     * 
     * @param updateTime
     *            the value for version.update_time
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
     * value of the database column version.check_sum_date
     * 
     * @return the value of version.check_sum_date
     * 
     * @mbggenerated
     */
    public Date getCheckSumDate() {
        return checkSumDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.check_sum_date
     * 
     * @param checkSumDate
     *            the value for version.check_sum_date
     * 
     * @mbggenerated
     */
    public void setCheckSumDate(Date checkSumDate) {
        if (!ObjectUtils.equals(checkSumDate, this.checkSumDate)) {
            getChangeLogInfo().put(PROPERTY_CHECKSUMDATE, checkSumDate);
        }
        this.checkSumDate = checkSumDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.project_id
     * 
     * @return the value of version.project_id
     * 
     * @mbggenerated
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.project_id
     * 
     * @param projectId
     *            the value for version.project_id
     * 
     * @mbggenerated
     */
    public void setProjectId(Long projectId) {
        if (!ObjectUtils.equals(projectId, this.projectId)) {
            getChangeLogInfo().put(PROPERTY_PROJECTID, projectId);
        }
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column version.environment_id
     * 
     * @return the value of version.environment_id
     * 
     * @mbggenerated
     */
    public Long getEnvironmentId() {
        return environmentId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column version.environment_id
     * 
     * @param environmentId
     *            the value for version.environment_id
     * 
     * @mbggenerated
     */
    public void setEnvironmentId(Long environmentId) {
        if (!ObjectUtils.equals(environmentId, this.environmentId)) {
            getChangeLogInfo().put(PROPERTY_ENVIRONMENTID, environmentId);
        }
        this.environmentId = environmentId;
    }

    /**
     * get table fields.
     * 
     * @return list of TableField
     */
    public List<TableField> getTableFieds() {
        List<TableField> list = new ArrayList<TableField>(9);
        TableField tf;
        tf = new TableField(PROPERTY_REMARK_ID, PROPERTY_ID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_NAME, PROPERTY_NAME);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_MEMO, PROPERTY_MEMO);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_CHECKSUM, PROPERTY_CHECKSUM);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_CREATECHCKSUM,
                PROPERTY_CREATECHCKSUM);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_UPDATETIME, PROPERTY_UPDATETIME);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_CHECKSUMDATE, PROPERTY_CHECKSUMDATE);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_PROJECTID, PROPERTY_PROJECTID);
        list.add(tf);
        tf = new TableField(PROPERTY_REMARK_ENVIRONMENTID,
                PROPERTY_ENVIRONMENTID);
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
        map.put(PROPERTY_MEMO, memo);
        map.put(PROPERTY_CHECKSUM, checkSum);
        map.put(PROPERTY_CREATECHCKSUM, createChckSum);
        map.put(PROPERTY_UPDATETIME,
                DateUtils.formatDate(updateTime, DateUtils.DEFAULT_PATTERN));
        map.put(PROPERTY_CHECKSUMDATE,
                DateUtils.formatDate(checkSumDate, DateUtils.DEFAULT_PATTERN));
        map.put(PROPERTY_PROJECTID, projectId);
        map.put(PROPERTY_ENVIRONMENTID, environmentId);
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
        map.put(PROPERTY_MEMO, memo);
        map.put(PROPERTY_CHECKSUM, checkSum);
        map.put(PROPERTY_CREATECHCKSUM, createChckSum);
        map.put(PROPERTY_UPDATETIME, updateTime);
        map.put(PROPERTY_CHECKSUMDATE, checkSumDate);
        map.put(PROPERTY_PROJECTID, projectId);
        map.put(PROPERTY_ENVIRONMENTID, environmentId);
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
        if (!(aThat instanceof VersionBase)) {
            return false;
        }

        final VersionBase THAT = (VersionBase) aThat;
        boolean result = true;
        result = result
                && (((this.getId() == null) && (THAT.getId() == null)) || (this
                        .getId() != null && this.getId().equals(THAT.getId())));
        return result;
    }
}