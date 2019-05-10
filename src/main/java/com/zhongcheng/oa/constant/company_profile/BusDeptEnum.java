package com.zhongcheng.oa.constant.company_profile;

public enum BusDeptEnum {

    zong_cai_ban(1, "总裁办"),
    ren_shu_bu(2, "人事部"),
    cai_wu_bu(3, "财务部"),
    ji_shu_bu(4, "技术部"),
    yu_qian_jian_ce(5, "舆情监测"),
    xiao_shou_1(6, "销售一部"),
    xiao_shou_2(7, "销售二部"),
    xiao_shou_KA(8, "KA销售部"),
    chan_pin_bu(9, "产品部"),
    she_ji_bu(10, "设计部"),
    mei_jie_bu(11, "媒介部"),
    yun_ying_bu(12, "运营部"),
    xin_mei_ti(13, "新媒体运营部"),
    xing_zheng(14, "行政")
    ;
    private int id;
    private String deptName;


    BusDeptEnum(int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }
}
