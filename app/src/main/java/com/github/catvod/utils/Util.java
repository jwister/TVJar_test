package com.github.catvod.utils;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

public class Util {

    private static List<String> uaList = Lists.newArrayList();

    static {
        uaList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36");
        uaList.add("Mozilla/5.01 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36");
        uaList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; Shuame)");
        uaList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; QQBrowser/7.3.8126.400)");
        uaList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; .NET CLR 1.1.4322)");
        uaList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; InfoPath.3)");
        uaList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)");
        uaList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0");
        uaList.add("Mozilla/5.0 (Macintosh mips64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh mips64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36 Edg/89.0.774.75");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.192 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.106 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.100 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/607.3.10 (KHTML, like Gecko) Version/12.1.2 Safari/607.3.10 Maxthon/5.1.60");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) MicroMessenger/6.8.0(0x16080000) MacWechat/3.0.1(0x13000110) NetType/WIFI WindowsWechat");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/13605.3.8 (KHTML, like Gecko) Version/9.1.1 Safari/13605.3.8");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1.1 Safari/605.1.15");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.122 Safari/537.36");
        uaList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; LCTE; Core/1.70.3676.400 QQBrowser/10.4.3469.400; rv:11.0) like Gecko");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; Core/1.70.3776.400 QQBrowser/10.6.4212.400; rv:11.0) like Gecko");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; Core/1.63.6788.400 QQBrowser/10.3.2727.400; rv:11.0) like Gecko");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.36 SLBrowser/7.0.0.2261 SLBChan/12");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36 XiaoBai/10.3.3217.1573 (XBCEF)");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.136 YaBrowser/20.2.4.143 Yowser/2.5 Yptp/1.23 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.87 Safari/537.36 SLBrowser/6.0.1.12161 SLBChan/103");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.200.124 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.1762.3 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36 2345Explorer/10.15.0.21066");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/546.36 (KHTML, like Gecko) Chrome/89.0.4385.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/543.36 (KHTML, like Gecko) Chrome/87.0.32496.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/542.36 (KHTML, like Gecko) Chrome/89.0.5219.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/542.36 (KHTML, like Gecko) Chrome/86.0.36322.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/540.36 (KHTML, like Gecko) Chrome/86.0.33219.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/538.36 (KHTML, like Gecko) Chrome/87.0.48110.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4466.0 Safari/537.36 Edg/91.0.859.0");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4455.2 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.72 Safari/537.36 Edg/90.0.818.39");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.11 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36 Edg/89.0.774.77");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4350.7 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.50 Safari/537.36 Edg/88.0.705.29");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.182 Safari/537.36 Edg/88.0.705.74");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36 Edg/87.0.664.66");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.67 Safari/537.36 OPR/73.0.3856.260");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.42434.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.56 Safari/537.36 Edg/83.0.478.33");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/82.0.4077.0 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4023.0 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3872.0 Safari/537.36 Edg/78.0.244.0");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.104 Safari/537.36 Edge/13.18362");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/536.36 (KHTML, like Gecko) Chrome/86.0.10846.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/535.36 (KHTML, like Gecko) Chrome/89.0.33519.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/533.36 (KHTML, like Gecko) Chrome/87.0.34697.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/530.36 (KHTML, like Gecko) Chrome/87.0.27523.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/528.36 (KHTML, like Gecko) Chrome/86.0.49343.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/525.36 (KHTML, like Gecko) Chrome/89.0.43907.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/511.36 (KHTML, like Gecko) Chrome/89.0.9922.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/509.36 (KHTML, like Gecko) Chrome/89.0.42050.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/508.36 (KHTML, like Gecko) Chrome/86.0.16571.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/506.36 (KHTML, like Gecko) Chrome/88.0.46354.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/504.36 (KHTML, like Gecko) Chrome/88.0.48271.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/503.36 (KHTML, like Gecko) Chrome/89.0.14272.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/503.36 (KHTML, like Gecko) Chrome/86.0.27485.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/500.36 (KHTML, like Gecko) Chrome/88.0.48357.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/499.36 (KHTML, like Gecko) Chrome/89.0.48906.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/498.36 (KHTML, like Gecko) Chrome/87.0.48788.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/496.36 (KHTML, like Gecko) Chrome/89.0.34528.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/494.36 (KHTML, like Gecko) Chrome/87.0.40937.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/491.36 (KHTML, like Gecko) Chrome/88.0.35623.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/491.36 (KHTML, like Gecko) Chrome/86.0.11902.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/490.36 (KHTML, like Gecko) Chrome/87.0.7030.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/489.36 (KHTML, like Gecko) Chrome/87.0.7809.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/483.36 (KHTML, like Gecko) Chrome/87.0.44790.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/482.36 (KHTML, like Gecko) Chrome/88.0.9787.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/481.36 (KHTML, like Gecko) Chrome/87.0.28829.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/476.36 (KHTML, like Gecko) Chrome/89.0.45365.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/473.36 (KHTML, like Gecko) Chrome/89.0.20219.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/473.36 (KHTML, like Gecko) Chrome/87.0.37035.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/472.36 (KHTML, like Gecko) Chrome/86.0.26591.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/471.36 (KHTML, like Gecko) Chrome/86.0.5210.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/469.36 (KHTML, like Gecko) Chrome/87.0.17682.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/466.36 (KHTML, like Gecko) Chrome/88.0.40585.82 Safari/537.36");
        uaList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/460.36 (KHTML, like Gecko) Chrome/88.0.30832.82 Safari/537.36");

    }




    public static boolean isEmpty(String str) {
        if (str == null || str == "") {
            return true;
        }
        return false;
    }

    public static String getRandomIp() {

        // 指定 IP 范围
        int[][] range = {
                {607649792, 608174079}, // 36.56.0.0-36.63.255.255
                {1038614528, 1039007743}, // 61.232.0.0-61.237.255.255
                {1783627776, 1784676351}, // 106.80.0.0-106.95.255.255
                {2035023872, 2035154943}, // 121.76.0.0-121.77.255.255
                {2078801920, 2079064063}, // 123.232.0.0-123.235.255.255
                {-1950089216, -1948778497}, // 139.196.0.0-139.215.255.255
                {-1425539072, -1425014785}, // 171.8.0.0-171.15.255.255
                {-1236271104, -1235419137}, // 182.80.0.0-182.92.255.255
                {-770113536, -768606209}, // 210.25.0.0-210.47.255.255
                {-569376768, -564133889}, // 222.16.0.0-222.95.255.255
        };

        Random random = new Random();
        int index = random.nextInt(10);
        String ip = num2ip(range[index][0] + random.nextInt(range[index][1] - range[index][0]));
        return ip;
    }

    /*
     * 将十进制转换成IP地址
     */
    public static String num2ip(int ip) {
        int[] b = new int[4];
        b[0] = (ip >> 24) & 0xff;
        b[1] = (ip >> 16) & 0xff;
        b[2] = (ip >> 8) & 0xff;
        b[3] = ip & 0xff;
        // 拼接 IP
        String x = b[0] + "." + b[1] + "." + b[2] + "." + b[3];
        return x;
    }


    public static  String  randomUserAgent(){
        return  uaList.get(new Random().nextInt(uaList.size()));
    }


}
