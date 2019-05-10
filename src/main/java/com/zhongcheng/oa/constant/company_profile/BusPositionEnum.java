package com.zhongcheng.oa.constant.company_profile;

public enum BusPositionEnum {

    gao_ceng(1, "高层"),
    zong_jian(2, "总监"),
    jing_li(3, "经理"),
    zu_zhang(4, "组长"),
    yuan_gong(5, "员工")
    ;
    private int id;
    private String PositionName;


    BusPositionEnum(int id, String PositionName) {
        this.id = id;
        this.PositionName = PositionName;
    }

    public int getId() {
        return id;
    }

    public String getPositionName() {
        return PositionName;
    }
}
