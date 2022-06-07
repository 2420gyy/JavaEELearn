package day11_9_30尚硅谷java高级._06IO流.节点流;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        ThreadLocal a = new ThreadLocal();
        a.set(new Integer(1));
        System.out.println(a);
    }

    @Test
    public void testFileRead() {
        /*
        main方法中
        默认相较于工程下
        任意一个包下，写 day09\\hello.txt
        单元测试中

         */
        //1.实例化file对象，指明要操作的文件
        FileReader fr = null;
        try {
//            在
            File file = new File("hello.txt");
            System.out.println(file.getAbsolutePath());//E:\Java EE learn\javastudy\java-12\hello.txt
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据读入 返回读入的字符，到达文件末尾，返回-1
            //
            int data = fr.read();
            while (data != -1){
                System.out.print((char)data);
                data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null){
                    fr.close();//不要用抛出的方式（前面直接抛出，那这里就执行不到了，不能关闭）
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
