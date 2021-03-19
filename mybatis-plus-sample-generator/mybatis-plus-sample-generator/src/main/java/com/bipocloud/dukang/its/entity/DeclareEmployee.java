package com.bipocloud.dukang.its.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 报送人员表
 * </p>
 *
 * @author Richard
 * @since 2021-02-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("declare_employee")
public class DeclareEmployee extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * workio员工id
     */
    @TableField("employee_id")
    private Long employeeId;

    /**
     * 公司id
     */
    @TableField("co_org_id")
    private Long coOrgId;

    /**
     * 证件姓名
     */
    @TableField("xm")
    private String xm;

    /**
     * 证件类型
     */
    @TableField("zzlx")
    private String zzlx;

    /**
     * 证照号码
     */
    @TableField("zzhm")
    private String zzhm;

    /**
     * 人员地区（是否境外人员）
     */
    @TableField("rydq")
    private Boolean rydq;

    /**
     * 资料是否变更
     */
    @TableField("changed")
    private Boolean changed;

    /**
     * 人员状态
     */
    @TableField("nsrzt")
    private String nsrzt;

    /**
     * 报送状态
     */
    @TableField("declare_status")
    private String declareStatus;

    /**
     * 验证状态
     */
    @TableField("check_status")
    private String checkStatus;

    /**
     * 报送时间
     */
    @TableField("declare_time")
    private LocalDateTime declareTime;

    /**
     * 失败原因
     */
    @TableField("failed_reason")
    private String failedReason;

    /**
     * 其他证照类型
     */
    @TableField("qtzzlx")
    private String qtzzlx;

    /**
     * 其他证照号码
     */
    @TableField("qtzzhm")
    private String qtzzhm;

    /**
     * 工号
     */
    @TableField("gh")
    private String gh;

    /**
     * 电话号码
     */
    @TableField("lxdh")
    private String lxdh;

    /**
     * 任职受雇类型
     */
    @TableField("sfgy")
    private String sfgy;

    /**
     * 受雇日期
     */
    @TableField("rzsgrq")
    private LocalDateTime rzsgrq;

    /**
     * 是否主单位
     */
    @TableField("sfzdw")
    private String sfzdw;

    /**
     * 性别
     */
    @TableField("xb")
    private String xb;

    /**
     * 出生日期
     */
    @TableField("csny")
    private LocalDateTime csny;

    /**
     * 国籍
     */
    @TableField("gj")
    private String gj;

    /**
     * 离职日期
     */
    @TableField("lzrq")
    private LocalDateTime lzrq;

    /**
     * 个人投资总额
     */
    @TableField("grgbze")
    private String grgbze;

    /**
     * 个人投资比例
     */
    @TableField("grgbbl")
    private String grgbbl;

    /**
     * 是否残疾
     */
    @TableField("sfcj")
    private String sfcj;

    /**
     * 是否烈属
     */
    @TableField("sfls")
    private String sfls;

    /**
     * 是否孤老
     */
    @TableField("sfgl")
    private String sfgl;

    /**
     * 残疾证号
     */
    @TableField("cjzh")
    private String cjzh;

    /**
     * 烈属证号
     */
    @TableField("lszh")
    private String lszh;

    /**
     * 邮箱
     */
    @TableField("dzyx")
    private String dzyx;

    /**
     * 学历
     */
    @TableField("xl")
    private String xl;

    /**
     * 职务
     */
    @TableField("zw")
    private String zw;

    /**
     * 开户银行
     */
    @TableField("khyh")
    private String khyh;

    /**
     * 银行账号
     */
    @TableField("yhzh")
    private String yhzh;

    /**
     * 开户银行省份
     */
    @TableField("khyhsfmz")
    private String khyhsfmz;

    /**
     * 居住省份
     */
    @TableField("lxdz_sheng")
    private String lxdzSheng;

    /**
     * 居住城市
     */
    @TableField("lxdz_shi")
    private String lxdzShi;

    /**
     * 居住区县
     */
    @TableField("lxdz_qx")
    private String lxdzQx;

    /**
     * 居住街道
     */
    @TableField("lxdz_jd")
    private String lxdzJd;

    /**
     * 居住详细地址
     */
    @TableField("lxdz")
    private String lxdz;

    /**
     * 户籍省份
     */
    @TableField("hjszd_sheng")
    private String hjszdSheng;

    /**
     * 户籍城市
     */
    @TableField("hjszd_shi")
    private String hjszdShi;

    /**
     * 户籍区县
     */
    @TableField("hjszd_qx")
    private String hjszdQx;

    /**
     * 户籍街道
     */
    @TableField("hjszd_jd")
    private String hjszdJd;

    /**
     * 户籍详细地址
     */
    @TableField("hjszd_xxdz")
    private String hjszdXxdz;

    /**
     * 备注
     */
    @TableField("bz")
    private String bz;

    /**
     * 出生地
     */
    @TableField("csd")
    private String csd;

    /**
     * 涉税事项
     */
    @TableField("sssx")
    private String sssx;

    /**
     * 首次入境时间
     */
    @TableField("scrjsj")
    private LocalDateTime scrjsj;

    /**
     * 预计离境时间
     */
    @TableField("yjljsj")
    private LocalDateTime yjljsj;

    /**
     * 联系地省份
     */
    @TableField("wjrlxdz_sheng")
    private String wjrlxdzSheng;

    /**
     * 联系地城市
     */
    @TableField("wjrlxdz_shi")
    private String wjrlxdzShi;

    /**
     * 联系地区县
     */
    @TableField("wjrlxdz_qx")
    private String wjrlxdzQx;

    /**
     * 联系地街道
     */
    @TableField("wjrlxdz_jd")
    private String wjrlxdzJd;

    /**
     * 联系地详细地址
     */
    @TableField("wjrlxdz_xxdz")
    private String wjrlxdzXxdz;

    /**
     * 中文名
     */
    @TableField("xmzw")
    private String xmzw;

    /**
     * 并档状态
     */
    @TableField("merged_employee_Archives")
    private String mergedEmployeeArchives;

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


    public static final String EMPLOYEE_ID = "employee_id";

    public static final String CO_ORG_ID = "co_org_id";

    public static final String XM = "xm";

    public static final String ZZLX = "zzlx";

    public static final String ZZHM = "zzhm";

    public static final String RYDQ = "rydq";

    public static final String CHANGED = "changed";

    public static final String NSRZT = "nsrzt";

    public static final String DECLARE_STATUS = "declare_status";

    public static final String CHECK_STATUS = "check_status";

    public static final String DECLARE_TIME = "declare_time";

    public static final String FAILED_REASON = "failed_reason";

    public static final String QTZZLX = "qtzzlx";

    public static final String QTZZHM = "qtzzhm";

    public static final String GH = "gh";

    public static final String LXDH = "lxdh";

    public static final String SFGY = "sfgy";

    public static final String RZSGRQ = "rzsgrq";

    public static final String SFZDW = "sfzdw";

    public static final String XB = "xb";

    public static final String CSNY = "csny";

    public static final String GJ = "gj";

    public static final String LZRQ = "lzrq";

    public static final String GRGBZE = "grgbze";

    public static final String GRGBBL = "grgbbl";

    public static final String SFCJ = "sfcj";

    public static final String SFLS = "sfls";

    public static final String SFGL = "sfgl";

    public static final String CJZH = "cjzh";

    public static final String LSZH = "lszh";

    public static final String DZYX = "dzyx";

    public static final String XL = "xl";

    public static final String ZW = "zw";

    public static final String KHYH = "khyh";

    public static final String YHZH = "yhzh";

    public static final String KHYHSFMZ = "khyhsfmz";

    public static final String LXDZ_SHENG = "lxdz_sheng";

    public static final String LXDZ_SHI = "lxdz_shi";

    public static final String LXDZ_QX = "lxdz_qx";

    public static final String LXDZ_JD = "lxdz_jd";

    public static final String LXDZ = "lxdz";

    public static final String HJSZD_SHENG = "hjszd_sheng";

    public static final String HJSZD_SHI = "hjszd_shi";

    public static final String HJSZD_QX = "hjszd_qx";

    public static final String HJSZD_JD = "hjszd_jd";

    public static final String HJSZD_XXDZ = "hjszd_xxdz";

    public static final String BZ = "bz";

    public static final String CSD = "csd";

    public static final String SSSX = "sssx";

    public static final String SCRJSJ = "scrjsj";

    public static final String YJLJSJ = "yjljsj";

    public static final String WJRLXDZ_SHENG = "wjrlxdz_sheng";

    public static final String WJRLXDZ_SHI = "wjrlxdz_shi";

    public static final String WJRLXDZ_QX = "wjrlxdz_qx";

    public static final String WJRLXDZ_JD = "wjrlxdz_jd";

    public static final String WJRLXDZ_XXDZ = "wjrlxdz_xxdz";

    public static final String XMZW = "xmzw";

    public static final String MERGED_EMPLOYEE_ARCHIVES = "merged_employee_Archives";

    public static final String DELETED = "deleted";

    public static final String CREATED_TIME = "created_time";

    public static final String UPDATED_TIME = "updated_time";

}
