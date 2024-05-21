import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tables.Standards;

import java.util.List;

@RestController
@RequestMapping("/api/v1/controller")
@AllArgsConstructor
public class Controller {
    @PostMapping("/send_files")
    public ResponseEntity<?> acceptReport(@RequestBody MultipartFile reportDto) {
        return ResponseEntity.ok().build();
    }
}
