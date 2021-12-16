package com.zh.fengshui.Test;

public class SuanGua {

    public static void main(String[] args) {

        String scbz = SuanGua.SCBZ(1998,8,"六月",11,12);
        System.out.println("你的生辰八字是："+scbz);
        String wx = SuanGua.WX(scbz);
        System.out.println("你的五行是："+wx);
    }


    /**
     *
     * @param year
     * @param GL_month
     * @param NL_month
     * @param day
     * @param hour
     * @return 生辰八字
     */
    public static String SCBZ(int year,int GL_month, String NL_month,int day,int hour){
        String GZ_y = FengShui.getGZ_Y(year);
        String GZ_m = FengShui.getGZ_M(GZ_y,NL_month);
        String GZ_d = FengShui.getGZ_D(year,GL_month,day);
        String H = FengShui.getGZ_H(hour);

        String GZ_h = FengShui.getGZ_HD(GZ_d,H);
        return GZ_y+GZ_m+GZ_d+GZ_h;
    }


    public static String WX(String SCBZ){

        String wx =null;
        if (SCBZ.contains("甲")||SCBZ.contains("乙")||SCBZ.contains("寅")||SCBZ.contains("卯")) {
            wx="木";
        }
        if (SCBZ.contains("丙")||SCBZ.contains("丁")||SCBZ.contains("巳")||SCBZ.contains("午")) {
            if(wx==null){
                wx="火";
            }else {
                wx=wx+"火";
            }
        }
        if (SCBZ.contains("戊")||SCBZ.contains("己")||SCBZ.contains("辰")||SCBZ.contains("丑")||SCBZ.contains("戌")||SCBZ.contains("未")) {
            if(wx==null){
                wx="土";
            }else {
                wx=wx+"土";
            }

        }
        if (SCBZ.contains("庚")||SCBZ.contains("辛")||SCBZ.contains("申")||SCBZ.contains("酉")) {
            if(wx==null){
                wx="金";
            }else {
                wx=wx+"金";
            }
        }
        if (SCBZ.contains("壬")||SCBZ.contains("癸")||SCBZ.contains("亥")||SCBZ.contains("子")) {
            if(wx==null){
                wx="水";
            }else {
                wx=wx+"水";
            }
        }
        return wx;
    }


}
