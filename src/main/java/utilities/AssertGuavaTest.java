package utilities;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 *
 * 断言 Pecordition
 *
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/5/1
 * @Time:22:09
 */
public class AssertGuavaTest {
    public static void main(String[] args) {
        //断言检查
        checkNotNull(null);

        //格式化断言输出
        checkNotNullWithFormatMessage(null);
    }

    public static void checkNotNull(final List<String> list){
        Preconditions.checkNotNull(list);
    }

    public static void checkNotNullWithFormatMessage(final List<String> list){
        Preconditions.checkNotNull(list,"this list should not be null adn the size musy be %s",2);
    }

}
