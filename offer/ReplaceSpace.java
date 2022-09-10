package offer;

import org.junit.Test;

/**
 * Created by lh on 2022/9/10
 * 替换字符串中空格
 * 考虑到String的不可变，使用StringBuilder类进行操作
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' '){
                    sb.append("%20");
                }else {
                    sb.append(s.charAt(i));
                }
            }
        return sb.toString();
 }


    @Test
    public void test(){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
