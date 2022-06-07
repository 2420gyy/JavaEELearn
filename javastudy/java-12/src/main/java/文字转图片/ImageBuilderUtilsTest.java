package 文字转图片;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenxiaokang
 * @date 2019/7/8 15:39
 */

@SpringBootTest
public class ImageBuilderUtilsTest {

    @Test
    public void imageBuilder() {
        String path =  ImageBuilderUtils.ImageBuilder("NO.1132323232","D:\\toolschenxiaokang\\qrcode_for_gh_02122d6b2ea8_258.jpg");
        System.out.println(path);
    }
}