package day06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author chenchen
 * @date 2022-04-22 23:40
 */
public class 文件输入输出 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(Path.of("E:\\Java EE learn\\javastudy\\java-12\\hello.txt"), StandardCharsets.UTF_8);
            System.out.println(in.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
