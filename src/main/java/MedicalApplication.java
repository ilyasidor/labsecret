import org.springframework.boot.autoconfigure.SpringBootApplication;
import tables.*;

import java.io.IOException;

@SpringBootApplication
public class MedicalApplication {
    public static void main(String[] args) throws IOException {
        //	SpringApplication.run(MedicalApplication.class, args);
        Tables.initializeAllExcelTables();
    }

}
