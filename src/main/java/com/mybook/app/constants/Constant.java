package com.mybook.app.constants;

/**
 * * 类注释
 *
 * @author: hz
 * @date: 2017/6/15
 * @time: 10:04
 * @see: 链接到其他资源
 * @since: 1.0
 * 常量配置
 */
public interface Constant {
    // 分页参数
    public static final Integer PAGE_NUM = 1;

    public static final Integer PAGE_SIZE = 30;

    // 初始状态待审核1 审核通过2 审核拒绝3
    public static final Integer VERIFY_STATUS_ZERO = 0;//新进件
    public static final Integer VERIFY_STATUS_ONE = 1;
    public static final Integer VERIFY_STATUS_TWO = 2;
    public static final Integer VERIFY_STATUS_THREE = 3;

    public static final Integer CONTRACT_TYPE_ZERO = 0; // 标准合同

    public static final Integer CONTRACT_TYPE_ONE = 1; // 非标准合同

    public static final Integer APPLICATION_TYPE_QD = 1; // 渠道

    public static final Integer APPLICATION_TYPE_WD = 2; // 网点

    public static final Integer OUTSIDE_CHANNEL = 1; // 外部渠道

    public static final Integer NOT_OUTSIDE_CHANNEL = 0; // 内部渠道

    public static final Integer VERIFY_STATUS_TAG_ONE = 1; // 标记1 主动修改

    public static final Integer VERIFY_STATUS_TAG_ZERO = 0;// 标记0  默认状态

    public static final Integer VERIFY_STATUS_TAG_TWO = 2;// 标记2(表示订单作废)

    public static final Integer VERIFY_STATUS_TAG_THREE = 3;// 同组被修改

    public static final Integer VERIFY_STATUS_TAG_MINUS_ONE = -1;// 标识 -1

    public static final Integer VERIFY_STATUS_TAG_MINUS_TWO = -2;// 标识 -2

    public static final Integer VERIFY_STATUS_TAG_MINUS_THREE = -3;// 标识 -3

    public static final Integer VERIFY_STATUS_TAG_MINUS_FOUR = -4;// 标识 -4

    // 审批记录状态====================start==============================
    public static final Integer APPROVAL_STATUS_ONE = 0; // 全部

    public static final Integer APPROVAL_STATUS_TWO = 1; // 待审核

    public static final Integer APPROVAL_STATUS_THREE = 2; // 审核通过

    public static final Integer APPROVAL_STATUS_FOUR = 3; // 审核拒绝

    public static final Integer APPROVAL_STATUS_THREE_ZERO = 20; //  市场部审核通过

    public static final Integer APPROVAL_STATUS_THREE_NOE = 21; //  网点总监审批通过

    public static final Integer APPROVAL_STATUS_THREE_TWO = 22; //  渠道总监审批通过

    public static final Integer APPROVAL_STATUS_THREE_THREE = 23; //  法务部审批通过

    public static final Integer APPROVAL_STATUS_THREE_FOUR = 24; //  运营总经理审批通过

    public static final Integer APPLICATIONTYPE = 2;//申请类型 ( 1 渠道 2 网点)

    public static final Integer TO_RAISE_THE = 31;//善林财富审核募集中

    public static final Integer WITH_THE_REVIEW = 32;//善林财富审核满标复核

    public static final Integer REVIEW_THE_FALLBACK = 33;//善林财富审核审核回退

    public static final Integer FAILURE_OF_BID = 34;//善林财富审核流标

    public static final Integer REFUSE = 35;//善林财富审核拒绝

    public static final Integer CONTRACT_STATUS = 1;//合同状态

    // 审批记录状态====================end==============================

    // 角色名====================start==============================
    public static final String ROLE_NAME_YW_WD = "网点业务员";
    public static final String ROLE_NAME_YW_QD = "渠道业务员";
    public static final String ROLE_NAME_QD_GENERAL = "渠道总监";
    public static final String ROLE_NAME_DIVISION = "法务部";
    public static final String ROLE_NAME_MANAGER = "总经理";
    public static final String ROLE_NAME_MARKET_DEPARTMENT = "市场部";
    public static final String ROLE_NAME_WD_GENERAL = "网点总监";
    // 角色名====================end==============================


    public static final String SEQ_TYPE_JS = "JS"; // 角色
    public static final String SEQ_TYPE_WD = "WD"; // 网点
    public static final String SEQ_TYPE_QD = "QD"; // 渠道

    public static final String ALL = "(2,3)"; // 全部
    public static final String SC_ALL = "(2,3,1)"; // 市场部全部
    public static final String WDZJ_ALL = "(2,3,20)"; // 渠道、网点总监全部
    public static final String QDZJ_ALL = "(2,3,22)"; // 渠道--法务全部
    public static final String FWB_ALL = "(2,3,21)"; // 法务部全部
    public static final String YY_ALL = "(2,3,23)"; // 运营总经理全部
    public static final Integer NOT_VERIFY_ROLE_USER = 0;// 当前用户无审核权限
    public static final Integer EXIST_VERIFY_ROLE_USER = 1;// 当前用户有审核权限

    public static final String SEQ = "0000";//合同编号初始化字符
    public static final String LUAPPEN = "LU-";//渠道前三位
    public static final String UKAPPEN = "UK-";//购销前三位
    public static final String ZLHZ = "ZLHZ";
    public static final String LINEAE = "-";


    public static final Integer TAG_ONE = 1;//待审核
    public static final Integer TAG_TWO = 2;//审核通过和拒绝
    public static final Integer TAG_THREE = 3;//总监查询全部标记
    public static final Integer TAG_FIVE = 5;//非总监查询全部标记
    public static final Integer TAG_FOUR = 4;//审核通过和拒绝
    public static final Integer WDZJ = 1; //  运营总经理审批通过

    public static final int ROLE_NAME_LENGTH = 20;//角色名称的最大长度
    public static final int ROLE_DESC_LENGTH = 80;//角色描述的最大长度
    public static final int REMARKS_LENGTH = 200;//备注的最大长度

    public static final int TYPE_ZERO = 0; // 标准合同
    public static final int TYPE_ONE = 1; // 非标准合同

    public static final int CONTRACT_TYPE_WDL = 0; // 网点租赁
    public static final int CONTRACT_TYPE_WDB = 1; // 网点购销
    public static final int CONTRACT_TYPE_WDC = 2; // 网点咨询服务
    public static final int CONTRACT_TYPE_QDC = 3; // 渠道咨询服务
    public static final int CONTRACT_TYPE_QDS = 4; // 渠道战略合作框架协议

    public static final String CONTRACT_L = "租赁合同";
    public static final String CONTRACT_B = "购销合同";
    public static final String CONTRACT_C = "咨询服务";
    public static final String CONTRACT_S = "战略合作框架协议";

    public static final int STATUS_ONE = 1; // 待审核
    public static final int STATUS_TWO = 2; // 审核通过
    public static final int STATUS_THREE = 3; // 审核拒绝


    public static final String CHANNEL_TYPE_NONE = "-1";// 渠道类型无的标记
    public static final String CHANNEL_NAME_NONE = "无";// 渠道类型无

    public static final String CONTRACTBERROR = "购销合同信息错误";
    public static final String CONTRACTCERROR = "咨询服务合同信息错误";
    public static final String CONTRACTLERROR = "租赁合同信息错误";
    public static final String CONTRACTSERROR = "战略合作框架协议信息错误";


    public static final String REGEX_EMAIL = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
    public static final String REGEX_MOBILE = "^1[3|4|5|7|8][0-9]{9}$";

    public static final String SALESMAN = "业务员";

    public static final String SUUCCESS_CODE = "000000";
    public static final Integer ORDER_PUSH = 0; //订单已推送
    public static final Integer ORDER_SUCCESS_FINANCE = 1; //已成功理财
    public static final Integer ORDER_FAIL = 2; //订单推送失败
    public static final String MENU_PASSWORD_NO = "m0017";

    public static final String OUTSIDE_CHANNEL_STRING = "1"; // 外部渠道
    public static final String NOT_OUTSIDE_CHANNEL_STRING = "0"; // 内部渠道

    public static final String AMAP_KEY = "ac54351d2364ffd4461dfed2bac6cf75"; //高德地图KEY

    public static final String VERUFY_STATUS_ONE = "(1)";//市场部
    public static final String VERUFY_STATUS_TWO = "(1,20,21,22)";//法务部
    public static final String VERUFY_STATUS_THREE = "(1,20,21,22,23)";//总经理
    public static final String VERUFY_STATUS_FOUR = "(1,20)";//总监

    public static final String ROLE_NAMES_ONE = "('市场部','渠道总监','网点总监','法务部','总经理')";//市场部
    public static final String ROLE_NAMES_TWO = "('法务部','总经理')";//法务部
    public static final String ROLE_NAMES_THREE = "('网点总监','法务部','总经理')";//网点总监
    public static final String ROLE_NAMES_FOUR = "('渠道总监','法务部','总经理')";//渠道总监
    public static final String TAG_START = "启用";//用户修改--角色启用

    public static final String PROPOSES_SOURCE = "0";//提报来源 进件系统
    //状态msg
    public static final String SLCF_REQUEST_FAIL = "http request fail";

    public static final String SLCF_PROJECT_STATUS_1 = "1";//发布中

    public static final String SLCF_PROJECT_STATUS_2 = "2";//满标

    public static final String SLCF_PROJECT_STATUS_3 = "3";//满标复核

    public static final String SLCF_PROJECT_STATUS_4 = "4";//拒绝

    public static final String SLCF_PROJECT_STATUS_5 = "5";//审核回退

    public static final String SLCF_PROJECT_STATUS_6 = "6";//流标

    public static final String ZDJ_REFUSH_STATUS_8 = "8";//终端机审核拒绝

}
