package com.zhongcheng.oa.constant.company_profile;

import java.util.HashMap;
import java.util.Map;

public enum BusRoleEnum {

    guan_li_yuan(1, "管理员" ),
    ren_shi(2, "人事" ),
    ji_shu(3, "技术" ),
    chan_pin(4, "产品" ),
    she_ji(5, "设计" ),
    mei_jie(6, "媒介" ),
    cai_wu(7, "财务" ),
    yun_ying(8, "运营" ),
    xiao_shou(9, "销售" ),
    gao_ceng(10, "高层" ),
    xing_zheng(11, "行政" );
    private int id;
    private String roleName;

    BusRoleEnum(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    static Map<Integer, String> idMap = new HashMap<>();

    static {
        BusRoleEnum[] values = values();
        for (BusRoleEnum value : values) {
            idMap.put(value.getId(), value.getRoleName());
        }
    }

    public static String getNameById(int id) {
        return idMap.get(id);
    }

//    public static void main(String[] args) {
//        System.out.println(BusRoleEnum.getNameById(8));
//    }

}


