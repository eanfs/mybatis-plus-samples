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
 * 考核周期详情表
 * </p>
 *
 * @author Richard
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cycle_detail")
public class CycleDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 考核周期表ID
     */
    @TableField("cycle_id")
    private Long cycleId;

    /**
     * 周期名称
     */
    @TableField("name")
    private String name;

    /**
     * 周期类型
     */
    @TableField("type")
    private String type;

    /**
     * 开始日期
     */
    @TableField("cycle_start_time")
    private LocalDateTime cycleStartTime;

    /**
     * 结束日期
     */
    @TableField("cycle_end_time")
    private LocalDateTime cycleEndTime;

    /**
     * 查看周期Id
     */
    @TableField("visible_commission_cycle_detail_id")
    private Long visibleCommissionCycleDetailId;

    /**
     * 删除
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

    public static final String CYCLE_ID = "cycle_id";

    public static final String NAME = "name";

    public static final String TYPE = "type";

    public static final String CYCLE_START_TIME = "cycle_start_time";

    public static final String CYCLE_END_TIME = "cycle_end_time";

    public static final String VISIBLE_COMMISSION_CYCLE_DETAIL_ID = "visible_commission_cycle_detail_id";

    public static final String DELETED = "deleted";

    public static final String CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updated_time";

}
