package utilities;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Splitter
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/5/1
 * @Time:21:44
 */
public class SplitterTest {
    public static void main(String[] args) {
        //分隔成list
        List<String> strings = Splitter.on("|").splitToList("hello|world||");
        System.out.println(strings.size());
        strings.forEach(System.out::println);

        //省略空字符串
        List<String> strings1 = Splitter.on("|").omitEmptyStrings().splitToList(" hello|world||");
        System.out.println(strings1.size());
        strings1.forEach(System.out::println);

        //去掉前后空字符串
        List<String> strings2 = Splitter.on("|").omitEmptyStrings().trimResults().splitToList("hello | world||");
        System.out.println(strings2.size());
        strings2.forEach(System.out::println);

        //根据指定长度分隔
        System.out.println("new start -----");
        List<String> strings3 = Splitter.fixedLength(2).splitToList("hello|world||");
        System.out.println(strings3.size());
        strings3.forEach(System.out::println);

        //强制分隔数组
        List<String> strings4 = Splitter.on("|").limit(3).splitToList("hello|world||");
        System.out.println(strings4.size());
        strings4.forEach(System.out::println);

        //正则方式
        List<String> strings5 = Splitter.onPattern("\\|").omitEmptyStrings().splitToList("hello|world||");
        System.out.println(strings5.size());
        strings5.forEach(System.out::println);

        //不建议使用的方式
        List<String> strings6 = Splitter.on(Pattern.compile("\\|")).omitEmptyStrings().splitToList("hello|world||");
        System.out.println(strings6.size());
        strings6.forEach(System.out::println);

        //分解map 将请求参数分解称为map
        Map<String,String> strings7 = Splitter.on("|")
                .trimResults().omitEmptyStrings().withKeyValueSeparator("=").split(" age=18|name=nimil ||");
        System.out.println(strings7.size());
        strings7.forEach((k,v)->System.out.println(k+":"+v));

    }

}
