package com.github.catvod.demo;

import com.github.catvod.spider.SP360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestSP360 {
    public static void main(String[] args) {
        SP360 sp360 = new SP360();
        // 首页内容测试
//        String s = sp360.homeContent(true);
//        System.out.println(s);

        // 分类内容测试
//        HashMap<String, String> map = new HashMap<>();
//        map.put("year", "2023");
//        map.put("actor", "成龙");
//        String s = sp360.categoryContent("1", "1", true, map);
//        System.out.println(s);

        // 详情内容测试
//        List<String> list = new ArrayList<>();
//        list.add("{\"detailReferer\":\"https://www.360kan.com/m/gKTiahH7QXH4TB.html\",\"detailUrl\":\"https://api.web.360kan.com/v1/detail?cat=1&id=gKTiahH7QXH4TB&callback=\"}");
//        list.add("{\"detailReferer\":\"https://www.360kan.com/tv/QLFtcX7mRmDqMX.html\",\"detailUrl\":\"https://api.web.360kan.com/v1/detail?cat=2&id=QLFtcX7mRmDqMX&callback=\"}");
//        String s = sp360.detailContent(list);
//        System.out.println(s);

        // 搜索内容测试
//        String s = sp360.searchContent("三体", true);
        String s = sp360.searchContent("满江红", true);
        System.out.println(s);
    }
}
