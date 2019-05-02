package utilities;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/5/2
 * @Time:21:22
 */
public class StringsTest {

    public static void main(String[] args) {
        //空转null
        String s = Strings.emptyToNull("");
        System.out.println(s);

        //null转空
        String s1 = Strings.nullToEmpty(null);
        System.out.println(s1);

        //求共同的前缀
        String s2 = Strings.commonPrefix("hellp", "hello");
        System.out.println(s2);

        //重复字符串三次
        String he = Strings.repeat("he", 3);
        System.out.println(he);

        //是否为空
        boolean nullOrEmpty = Strings.isNullOrEmpty("");
        System.out.println(nullOrEmpty);

        //是否为空
        boolean nullOrEmpty1 = Strings.isNullOrEmpty(null);
        System.out.println(nullOrEmpty1);

        //最低长度，不够用char填充
        String s3 = Strings.padStart("ss", 3, 'h');
        System.out.println(s3);

        //字符判断
        boolean x = CharMatcher.javaDigit().matches('x');
        System.out.println(x);

        //移出空格和数字保留相应的结果
        String s12e_sds2323 = CharMatcher.javaDigit().or(CharMatcher.whitespace()).removeFrom("s12e sds2323");
        System.out.println(s12e_sds2323);

    }
}
