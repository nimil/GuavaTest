package utilities;

import com.google.common.base.Joiner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/4/28
 * @Time:23:04
 */
public class JoinerTest {

    private static List<String> list = new ArrayList<>(7);

    public static void main(String[] args) throws IOException {

        list.add("sss");
        list.add("kkkk");
        list.add("sssss");
        list.add(null);
        list.add(new Date().toString());
        String join = Joiner.on(",").useForNull("default").join(list);

        System.out.println(join);

        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder aDefault = Joiner.on("#").useForNull("default").appendTo(stringBuilder, list);


        System.out.println(aDefault.toString());
        //还可以append到writer流中
        FileWriter fileWriter = new FileWriter(new File("test.txt"));
        Joiner.on("*").useForNull("nulk").appendTo(fileWriter,list);
        fileWriter.flush();
        fileWriter.close();

    }


}
