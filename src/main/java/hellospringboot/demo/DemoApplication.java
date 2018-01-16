package hellospringboot.demo;

import hellospringboot.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {
    public static HashMap<Long, Student> studentHashMap;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        studentHashMap = new HashMap<>();
        Student one = new Student("hello", "spring");
        studentHashMap.put(1l, one);
        Student two = new Student("hello2", "spring2");
        studentHashMap.put(2l, two);
    }
}
