package com.zh.fengshui.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Demo1 {
    public static void main(String[] args) {
//        int i =0;
//        i++;
//        i=i++;
//        int j = i + i++ * ++i;
//        System.out.println(i);
//        System.out.println(j);
        String s ="{\"code\":10010,\"message\":\"程序异常，导入失败\",\"success\":false}";
        JSONObject result = JSON.parseObject(s);
        JSONArray resultArray =result.getJSONArray("result");
        if (resultArray==null){
            System.out.println("kong de");
        }

    }
}
