package src.demo.java20210331;

import java.util.*;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【最长重复子串】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/31 15:16
 **/
public class LongestRepeatingSubstring {

    public static void main(String[] args) {

        String s1 = "LongestRepeatingSubstring";
        char[] chars = s1.toCharArray();
        List strList = new ArrayList();
        Set strSet = new HashSet();
        Collections.addAll(strList,chars);
        System.out.println(strList);
        Collections.addAll(strSet,chars);
/*        List<String> strings = Arrays.asList(chars);
        System.out.println(strings.get(0));
        Set set = new HashSet(chars);*/
        Set strSet2 = new HashSet();
        strSet2.add(s1);
        strSet2.add(s1);
        System.out.println(strSet);
    }
}
