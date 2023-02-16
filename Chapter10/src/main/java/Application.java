import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author:yang
 * @time:2023/2/16 13:23
 */
@SpringBootApplication
@ComponentScan("com.course.server") //扫描类
public class Application {
    public static void main(String[] args) {
        //固定写法
        SpringApplication.run(Application.class, args);
    }
}
