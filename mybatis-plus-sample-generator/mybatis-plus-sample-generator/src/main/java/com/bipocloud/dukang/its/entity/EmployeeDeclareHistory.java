package com.bipocloud.dukang.its.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 员工报送时间历史记录表
 * </p>
 *
 * @author Richard
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("employee_declare_history")
public class EmployeeDeclareHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 员工id
     */
    @TableField("employee_id")
    private Long employeeId;

    /**
     * 公司ID
     */
    @TableField("co_org_id")
    private Long coOrgId;

    /**
     * 报送人员ID
     */
    @TableField("declare_employee_id")
    private Long declareEmployeeId;

    /**
     * 人员状态
     */
    @TableField("nsrzt")
    private String nsrzt;

    /**
     * 报送时间
     */
    @TableField("declare_time")
    private LocalDateTime declareTime;

    /**
     * 是否删除
     */
    @TableField("deleted")
    private Boolean deleted;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 修改时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;


    public static final String ID = "id";

    public static final String EMPLOYEE_ID = "employee_id";

    public static final String CO_ORG_ID = "co_org_id";

    public static final String DECLARE_EMPLOYEE_ID = "declare_employee_id";

    public static final String NSRZT = "nsrzt";

    public static final String DECLARE_TIME = "declare_time";

    public static final String DELETED = "deleted";

    public static final String CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updated_time";

}
