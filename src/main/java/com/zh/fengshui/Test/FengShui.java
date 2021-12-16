package com.zh.fengshui.Test;

public class FengShui {




    /**
     * 最后俩字
     * @param GZ_d 干支天
     * @param GZ_h 干支时第八个字
     * @return 干支时最后俩字
     */
    public static String getGZ_HD(String GZ_d, String GZ_h){

        GZ_d =GZ_d.substring(0,1);
        switch (GZ_h) {
            case "子":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "甲子";
                    case "庚":
                    case "乙":
                        return "丙子";
                    case "丙":
                    case "辛":
                        return "戊子";
                    case "丁":
                    case "壬":
                        return "庚子";
                    case "戊":
                    case "癸":
                        return "壬子";
                }
            case "丑":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "乙丑";
                    case "庚":
                    case "乙":
                        return "丁丑";
                    case "丙":
                    case "辛":
                        return "己丑";
                    case "丁":
                    case "壬":
                        return "辛丑";
                    case "戊":
                    case "癸":
                        return "癸丑";
                }
            case "寅":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "丙寅";
                    case "庚":
                    case "乙":
                        return "戊寅";
                    case "丙":
                    case "辛":
                        return "庚寅";
                    case "丁":
                    case "壬":
                        return "壬寅";
                    case "戊":
                    case "癸":
                        return "甲寅";
                }
            case "卯":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "丁卯";
                    case "庚":
                    case "乙":
                        return "己卯";
                    case "丙":
                    case "辛":
                        return "辛卯";
                    case "丁":
                    case "壬":
                        return "癸卯";
                    case "戊":
                    case "癸":
                        return "乙卯";
                }
            case "辰":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "戊辰";
                    case "庚":
                    case "乙":
                        return "庚辰";
                    case "丙":
                    case "辛":
                        return "壬辰";
                    case "丁":
                    case "壬":
                        return "甲辰";
                    case "戊":
                    case "癸":
                        return "丙辰";
                }
            case "巳":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "己巳";
                    case "庚":
                    case "乙":
                        return "辛巳";
                    case "丙":
                    case "辛":
                        return "癸巳";
                    case "丁":
                    case "壬":
                        return "乙巳";
                    case "戊":
                    case "癸":
                        return "丁巳";
                }
            case "午":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "庚午";
                    case "庚":
                    case "乙":
                        return "壬午";
                    case "丙":
                    case "辛":
                        return "甲午";
                    case "丁":
                    case "壬":
                        return "丙午";
                    case "戊":
                    case "癸":
                        return "戊午";
                }
            case "未":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "辛未";
                    case "庚":
                    case "乙":
                        return "癸未";
                    case "丙":
                    case "辛":
                        return "乙未";
                    case "丁":
                    case "壬":
                        return "丁未";
                    case "戊":
                    case "癸":
                        return "己未";
                }
            case "申":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "壬申";
                    case "庚":
                    case "乙":
                        return "甲申";
                    case "丙":
                    case "辛":
                        return "丙申";
                    case "丁":
                    case "壬":
                        return "戊申";
                    case "戊":
                    case "癸":
                        return "庚申";
                }
            case "酉":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "癸酉";
                    case "庚":
                    case "乙":
                        return "乙酉";
                    case "丙":
                    case "辛":
                        return "丁酉";
                    case "丁":
                    case "壬":
                        return "己酉";
                    case "戊":
                    case "癸":
                        return "辛酉";
                }
            case "戌":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "甲戌";
                    case "庚":
                    case "乙":
                        return "丙戌";
                    case "丙":
                    case "辛":
                        return "戊戌";
                    case "丁":
                    case "壬":
                        return "庚戌";
                    case "戊":
                    case "癸":
                        return "壬戌";
                }
            case "亥":
                switch (GZ_d) {
                    case "甲":
                    case "己":
                        return "乙亥";
                    case "庚":
                    case "乙":
                        return "丁亥";
                    case "丙":
                    case "辛":
                        return "己亥";
                    case "丁":
                    case "壬":
                        return "辛亥";
                    case "戊":
                    case "癸":
                        return "癸亥";
                }
            default:
                return "你已经跳出三界之外，不在五行之中，可喜可贺，可喜可贺啊！";
        }

    }

    /**
     * 第八个字
     * @param hour 出生时辰
     * @return 第八个字
     */
    public static String getGZ_H(int hour){

        switch (hour) {
            case 23 :
            case 24 :
                return "子";
            case 1 :
            case 2 :
                return "丑";
            case 3 :
            case 4 :
                return "寅";
            case 5 :
            case 6 :
                return "卯";
            case 7 :
            case 8 :
                return "辰";
            case 9 :
            case 10 :
                return "巳";
            case 11 :
            case 12 :
                return  "午";
            case 13 :
            case 14 :
                return  "未";
            case 15 :
            case 16 :
                return   "申";
            case 17 :
            case 18 :
                return "酉";
            case 19 :
            case 20 :
                return "戌";
            case 21 :
            case 22 :
                return  "亥";
            default:
                return   "你已经跳出三界之外，不在五行之中，可喜可贺，可喜可贺啊！";
        }

    }

    /**
     * 获取干支日
     * @param year 公历年
     * @param month 公历月
     * @param day 公历日
     * @return 干支日
     */
    public static String getGZ_D(int year,int month,int day) {
        //年份
        String yearStr = String.valueOf(year);
        int b2 =Integer.parseInt(yearStr.substring(0,2));
        int a2 =Integer.parseInt(yearStr.substring(2,4));
        //月份
        if (month == 1) {
            month=13;
        } else if (month == 2) {
            month=14;
        }
        //i
        int i=0;
        if (month % 2 == 0) {
            i=6;
        }
        //天干
        int tg =(4 * b2 + b2 / 4 + 5 * a2 + a2 / 4 + 3 * (month + 1) / 5 + day - 3) % 10;
        //地支
        int dz = (8 * b2 + b2 / 4 + 5 * a2 + a2 / 4 + 3 * (month + 1) / 5 + day + 7 + i) % 12;

        String TG=null;
        String DZ=null;

        //天干
        if (tg == 1) {
            TG = "甲";
        } else if (tg == 2) {
            TG = "乙";
        } else if (tg == 3) {
            TG = "丙";
        } else if (tg == 4) {
            TG = "丁";
        } else if (tg == 5) {
            TG = "戊";
        } else if (tg == 6) {
            TG = "己";
        } else if (tg == 7) {
            TG = "庚";
        } else if (tg == 8) {
            TG = "辛";
        } else if (tg == 9) {
            TG = "壬";
        } else if (tg == 0) {
            TG = "癸";
        }
        //地支
        if (dz==1) {
            DZ="子";
        } else if (dz==2) {
            DZ="丑";
        }else if (dz==3) {
            DZ="寅";
        }else if (dz==4) {
            DZ="卯";
        }else if (dz==5) {
            DZ="辰";
        }else if (dz==6) {
            DZ="巳";
        }else if (dz==7) {
            DZ="午";
        }else if (dz==8) {
            DZ="未";
        }else if (dz==9) {
            DZ="申";
        }else if (dz==10) {
            DZ="酉";
        }else if (dz==11) {
            DZ="戌";
        }else if (dz==0) {
            DZ="亥";
        }
        return TG+DZ;
    }

    /**
     * 获取干支月份
     * @param GZ_year 干支年
     * @param month 农历月
     * @return 干支月
     */
    public static String getGZ_M(String GZ_year,String month){
        String yearToal = GZ_year.substring(0,1);
        switch (yearToal) {
            case "甲":
            case "己":
                switch (month) {
                    case "正月":
                        return "丙寅";
                    case "二月":
                        return "丁卯";
                    case "三月":
                        return "戊辰";
                    case "四月":
                        return "己巳";
                    case "五月":
                        return "庚午";
                    case "六月":
                        return "辛未";
                    case "七月":
                        return "壬申";
                    case "八月":
                        return "癸酉";
                    case "九月":
                        return "甲戌";
                    case "十月":
                        return "乙亥";
                    case "十一月":
                        return "丙子";
                    case "十二月":
                        return "丁丑";
                }
                break;
            case "乙":
            case "庚":

                switch (month) {
                    case "正月":
                        return "戊寅";
                    case "二月":
                        return "己卯";
                    case "三月":
                        return "庚辰";
                    case "四月":
                        return "辛巳";
                    case "五月":
                        return "壬午";
                    case "六月":
                        return "癸未";
                    case "七月":
                        return "甲申";
                    case "八月":
                        return "乙酉";
                    case "九月":
                        return "丙戌";
                    case "十月":
                        return "丁亥";
                    case "十一月":
                        return "戊子";
                    case "十二月":
                        return "己丑";
                }
                break;
            case "丙":
            case "辛":

                switch (month) {
                    case "正月":
                        return "庚寅";
                    case "二月":
                        return "辛卯";
                    case "三月":
                        return "壬辰";
                    case "四月":
                        return "癸巳";
                    case "五月":
                        return "甲午";
                    case "六月":
                        return "乙未";
                    case "七月":
                        return "丙申";
                    case "八月":
                        return "丁酉";
                    case "九月":
                        return "戊戌";
                    case "十月":
                        return "己亥";
                    case "十一月":
                        return "庚子";
                    case "十二月":
                        return "辛丑";
                }
                break;
            case "丁":
            case "壬":

                switch (month) {
                    case "正月":
                        return "壬寅";
                    case "二月":
                        return "癸卯";
                    case "三月":
                        return "甲辰";
                    case "四月":
                        return "乙巳";
                    case "五月":
                        return "丙午";
                    case "六月":
                        return "丁未";
                    case "七月":
                        return "戊申";
                    case "八月":
                        return "己酉";
                    case "九月":
                        return "庚戌";
                    case "十月":
                        return "辛亥";
                    case "十一月":
                        return "壬子";
                    case "十二月":
                        return "癸丑";
                }
                break;
            case "戊":
            case "癸":

                switch (month) {
                    case "正月":
                        return "甲寅";
                    case "二月":
                        return "乙卯";
                    case "三月":
                        return "丙辰";
                    case "四月":
                        return "丁巳";
                    case "五月":
                        return "戊午";
                    case "六月":
                        return "己未";
                    case "七月":
                        return "庚申";
                    case "八月":
                        return "辛酉";
                    case "九月":
                        return "壬戌";
                    case "十月":
                        return "癸亥";
                    case "十一月":
                        return "甲子";
                    case "十二月":
                        return "乙丑";
                }
                break;
        }
        return "你已经跳出三界之外，不在五行之中，可喜可贺，可喜可贺啊！";
    }


    /**
     * 获取干支年
     * @param year 公历年
     * @return 干支年
     */
    public static String getGZ_Y(int year) {
        int gz_Y = year%60;
        if (gz_Y < 4) {
            gz_Y=gz_Y+60;
        }
        switch (gz_Y-4) {
            case(0) :{
                return YYYYmm.GZ_00.substring(0,2);
            }
            case(1) :{
                return YYYYmm.GZ_01.substring(0,2);
            }
            case(2) :{
                return YYYYmm.GZ_02.substring(0,2);
            }
            case(3) :{
                return YYYYmm.GZ_03.substring(0,2);
            }
            case(4) :{
                return YYYYmm.GZ_04.substring(0,2);
            }
            case(5) :{
                return YYYYmm.GZ_05.substring(0,2);
            }
            case(6) :{
                return YYYYmm.GZ_06.substring(0,2);
            }
            case(7) :{
                return YYYYmm.GZ_07.substring(0,2);
            }
            case(8) :{
                return YYYYmm.GZ_08.substring(0,2);
            }
            case(9) :{
                return YYYYmm.GZ_09.substring(0,2);
            }
            case(10) :{
                return YYYYmm.GZ_10.substring(0,2);
            }
            case(11) :{
                return YYYYmm.GZ_11.substring(0,2);
            }
            case(12) :{
                return YYYYmm.GZ_12.substring(0,2);
            }
            case(13) :{
                return YYYYmm.GZ_13.substring(0,2);
            }
            case(14) :{
                return YYYYmm.GZ_14.substring(0,2);
            }
            case(15) :{
                return YYYYmm.GZ_15.substring(0,2);
            }
            case(16) :{
                return YYYYmm.GZ_16.substring(0,2);
            }
            case(17) :{
                return YYYYmm.GZ_17.substring(0,2);
            }
            case(18) :{
                return YYYYmm.GZ_18.substring(0,2);
            }
            case(19) :{
                return YYYYmm.GZ_19.substring(0,2);
            }
            case(20) :{
                return YYYYmm.GZ_20.substring(0,2);
            }
            case(21) :{
                return YYYYmm.GZ_21.substring(0,2);
            }
            case(22) :{
                return YYYYmm.GZ_22.substring(0,2);
            }
            case(23) :{
                return YYYYmm.GZ_23.substring(0,2);
            }
            case(24) :{
                return YYYYmm.GZ_24.substring(0,2);
            }
            case(25) :{
                return YYYYmm.GZ_25.substring(0,2);
            }
            case(26) :{
                return YYYYmm.GZ_26.substring(0,2);
            }
            case(27) :{
                return YYYYmm.GZ_27.substring(0,2);
            }
            case(28) :{
                return YYYYmm.GZ_28.substring(0,2);
            }
            case(29) :{
                return YYYYmm.GZ_29.substring(0,2);
            }
            case(30) :{
                return YYYYmm.GZ_30.substring(0,2);
            }
            case(31) :{
                return YYYYmm.GZ_31.substring(0,2);
            }
            case(32) :{
                return YYYYmm.GZ_32.substring(0,2);
            }
            case(33) :{
                return YYYYmm.GZ_33.substring(0,2);
            }
            case(34) :{
                return YYYYmm.GZ_34.substring(0,2);
            }
            case(35) :{
                return YYYYmm.GZ_35.substring(0,2);
            }
            case(36) :{
                return YYYYmm.GZ_36.substring(0,2);
            }
            case(37) :{
                return YYYYmm.GZ_37.substring(0,2);
            }
            case(38) :{
                return YYYYmm.GZ_38.substring(0,2);
            }
            case(39) :{
                return YYYYmm.GZ_39.substring(0,2);
            }
            case(40) :{
                return YYYYmm.GZ_40.substring(0,2);
            }
            case(41) :{
                return YYYYmm.GZ_41.substring(0,2);
            }
            case(42) :{
                return YYYYmm.GZ_42.substring(0,2);
            }
            case(43) :{
                return YYYYmm.GZ_43.substring(0,2);
            }
            case(44) :{
                return YYYYmm.GZ_44.substring(0,2);
            }
            case(45) :{
                return YYYYmm.GZ_45.substring(0,2);
            }
            case(46) :{
                return YYYYmm.GZ_46.substring(0,2);
            }
            case(47) :{
                return YYYYmm.GZ_47.substring(0,2);
            }
            case(48) :{
                return YYYYmm.GZ_48.substring(0,2);
            }
            case(49) :{
                return YYYYmm.GZ_49.substring(0,2);
            }
            case(50) :{
                return YYYYmm.GZ_50.substring(0,2);
            }
            case(51) :{
                return YYYYmm.GZ_51.substring(0,2);
            }
            case(52) :{
                return YYYYmm.GZ_52.substring(0,2);
            }
            case(53) :{
                return YYYYmm.GZ_53.substring(0,2);
            }
            case(54) :{
                return YYYYmm.GZ_54.substring(0,2);
            }
            case(55) :{
                return YYYYmm.GZ_55.substring(0,2);
            }
            case(56) :{
                return YYYYmm.GZ_56.substring(0,2);
            }
            case(57) :{
                return YYYYmm.GZ_57.substring(0,2);
            }
            case(58) :{
                return YYYYmm.GZ_58.substring(0,2);
            }
            case(59) :{
                return YYYYmm.GZ_59.substring(0,2);
            }
            default :{
                return "你已经跳出三界之外，不在五行之中，可喜可贺，可喜可贺啊！";
            }
        }
    }
}
