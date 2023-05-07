package com.github.catvod.demo;

import com.github.catvod.spider.BTPiaoHua;

import java.util.ArrayList;
import java.util.HashMap;

public class TestBTPiaoHua {
    public static void main(String[] args) {
        BTPiaoHua btPiaoHua = new BTPiaoHua();
        // 首页测试，输出...
//        String s = btPiaoHua.homeContent(true);
//        System.out.println(s);

        // 分类页面数据测试
        String s = btPiaoHua.categoryContent("/dongzuo/", "1", true, new HashMap<>());
        System.out.println(s);

        // 详情页面数据测试
//        ArrayList<String> ids = new ArrayList<>();
//        ids.add("https://www.xpiaohua.com/column/lianxuju/20210221/51623.html");
//        String s = btPiaoHua.detailContent(ids);
//        System.out.println(s);

        // 搜索测试
//        String s = btPiaoHua.searchContent("我", true);
//        System.out.println(s);

    }
}
