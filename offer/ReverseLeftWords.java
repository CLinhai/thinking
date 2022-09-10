package offer;

/**
 * Created by lh on 2022/9/10
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        //前面n个数移动到后面的位置
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < n) {
                sb1.append(c);
            }else {
                sb2.append(c);
            }
        }
        sb1 = sb2.append(sb1);
        return sb1.toString();
    }
}
