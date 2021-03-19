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
 * PTS数据交换记录表
 * </p>
 *
 * @author Richard
 * @since 2021-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pts_request_history")
public class PtsRequestHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("id")
    private Long id;

    /**
     * 批量报送批次ID
     */
    @TableField("batch_id")
    private Long batchId;

    /**
     * PTS RequestId
     */
    @TableField("request_id")
    private String requestId;

    /**
     * PTS 业务类型
     */
    @TableField("request_type")
    private String requestType;

    /**
     * 公司ID
     */
    @TableField("co_org_id")
    private Long coOrgId;

    /**
     * 发送的请求BODY
     */
    @TableField("request_body")
    private String requestBody;

    /**
     * 接收的数据
     */
    @TableField("response")
    private String response;

    /**
     * 处理结果
     */
    @TableField("result")
    private String result;

    /**
     * 错误内容
     */
    @TableField("error_message")
    private String errorMessage;

    /**
     * 逻辑删除FLAG
     */
    @TableField("deleted")
    private String deleted;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


    public static final String ID = "id";

    public static final String BATCH_ID = "batch_id";

    public static final String REQUEST_ID = "request_id";

    public static final String REQUEST_TYPE = "request_type";

    public static final String CO_ORG_ID = "co_org_id";

    public static final String REQUEST_BODY = "request_body";

    public static final String RESPONSE = "response";

    public static final String RESULT = "result";

    public static final String ERROR_MESSAGE = "error_message";

    public static final String DELETED = "deleted";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

}
