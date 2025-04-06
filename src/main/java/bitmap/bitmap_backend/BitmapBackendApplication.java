package bitmap.bitmap_backend;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
@EnableEncryptableProperties
public class BitmapBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitmapBackendApplication.class, args);
	}

}
