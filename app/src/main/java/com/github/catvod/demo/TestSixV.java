package com.github.catvod.demo;

import android.content.Context;

import com.github.catvod.spider.SixV;

import java.util.ArrayList;
import java.util.HashMap;

public class TestSixV {
    public static void main(String[] args) {
        SixV sixV = new SixV();
        sixV.init(new Context(), "https://www.66ss.org");
        // 首页测试，输出...
//        String s = sixV.homeContent(true);
//        System.out.println(s);

        // 分类页面数据测试
//        String s = sixV.categoryContent("my_tid_movie", "1", true, new HashMap<>());
//        System.out.println(s);

        // 详情页面数据测试
        ArrayList<String> ids = new ArrayList<>();
//        ids.add("https://www.66ss.org/xijupian/20346.html");
//        ids.add("https://www.66ss.org/xijupian/20531.html");
        ids.add("https://www.66ss.org/xijupian/20620.html");
        // ids.add("https://www.66s.cc/dongzuopian/21174.html");
        // ids.add("https://www.66s.cc/donghuapian/21001.html");
        ids.add("https://www.66s.cc/donghuapian/20991.html");
        String s = sixV.detailContent(ids);
        System.out.println(s);

        // 搜索测试
//        String s = sixV.searchContent("保镖", true);
//        System.out.println(s);

    }
}
