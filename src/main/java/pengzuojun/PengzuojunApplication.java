package pengzuojun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("pengzuojun.dao")
@SpringBootApplication
public class PengzuojunApplication {

    public static void main(String[] args) {
        SpringApplication.run(PengzuojunApplication.class, args);
    }

}
