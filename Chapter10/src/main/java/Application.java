import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:spring统一启动方法
 * @author:yang
 * @time:2023/2/16 13:23
 */
@SpringBootApplication
@ComponentScan("com.course") //扫描目录
public class Application {
    public static void main(String[] args) {
        //固定写法
        SpringApplication.run(Application.class, args);
    }
}
