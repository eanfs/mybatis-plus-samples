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
 * 考核周期表
 * </p>
 *
 * @author Richard
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cycle")
public class Cycle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 公司ID
     */
    @TableField("cid")
    private Long cid;

    /**
     * 考核年度
     */
    @TableField("year")
    private Integer year;

    /**
     * 开始月份
     */
    @TableField("start_month")
    private String startMonth;

    /**
     * 开始日期
     */
    @TableField("start_day")
    private String startDay;

    /**
     * 月度开关
     */
    @TableField("month_switch")
    private Boolean monthSwitch;

    /**
     * 季度开关
     */
    @TableField("quarter_switch")
    private Boolean quarterSwitch;

    /**
     * 半年度开关
     */
    @TableField("half_year_switch")
    private Boolean halfYearSwitch;

    /**
     * 年度开关
     */
    @TableField("year_switch")
    private Boolean yearSwitch;

    /**
     * 最小切分单元
     */
    @TableField("minimum_unit")
    private String minimumUnit;

    /**
     * 查看单元
     */
    @TableField("visible_unit")
    private String visibleUnit;

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

    public static final String CID = "cid";

    public static final String YEAR = "year";

    public static final String START_MONTH = "start_month";

    public static final String START_DAY = "start_day";

    public static final String MONTH_SWITCH = "month_switch";

    public static final String QUARTER_SWITCH = "quarter_switch";

    public static final String HALF_YEAR_SWITCH = "half_year_switch";

    public static final String YEAR_SWITCH = "year_switch";

    public static final String MINIMUM_UNIT = "minimum_unit";

    public static final String VISIBLE_UNIT = "visible_unit";

    public static final String DELETED = "deleted";

    public static final String CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updated_time";

}
