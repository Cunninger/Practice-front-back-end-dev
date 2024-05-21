package mychatroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("mychatroom.mappers")
public class MychatroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MychatroomApplication.class, args);
    }

}
