package hellospringboot.demo;

import hellospringboot.demo.DemoApplication;
import hellospringboot.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/rest/student")
public class StudentService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HashMap<Long, Student> getAllStudents() {
        return DemoApplication.studentHashMap;
    }
}
