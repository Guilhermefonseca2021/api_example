
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan({"br.com.api.controllers"})
@RestController
public class ApiAplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiAplication.class, args);
    }
    
    @GetMapping("/")
    public String greet() {
        return "Hello";
    }

    @GetMapping("/greet")
    public GreetResponse greet2() {
        return new GreetResponse(
            "hello", 
            List.of("Java", "Javascript", "Typescript"), 
            new Person("Guilherme", 21, 1.500));
    }

    record Person(String name, int age, double availableCash) {
        
    }
    // record to simplify JSON
    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person) {
        
    }
    

    // the same result above
    // class GreetResponse {
    //     private final String greet;
    //     public GreetResponse(String greet) {
    //         this.greet = greet;
    //     }

    //     public String getGreet() {
    //         return greet;
    //     }

    //     @Override
    //     public String toString() {
    //         return "GreetResponse [greet=" + greet + "]";
    //     }

    //     @Override
    //     public int hashCode() {
    //         final int prime = 31;
    //         int result = 1;
    //         result = prime * result + getEnclosingInstance().hashCode();
    //         result = prime * result + ((greet == null) ? 0 : greet.hashCode());
    //         return result;
    //     }

    //     @Override
    //     public boolean equals(Object obj) {
    //         if (this == obj)
    //             return true;
    //         if (obj == null)
    //             return false;
    //         if (getClass() != obj.getClass())
    //             return false;
    //         GreetResponse other = (GreetResponse) obj;
    //         if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
    //             return false;
    //         if (greet == null) {
    //             if (other.greet != null)
    //                 return false;
    //         } else if (!greet.equals(other.greet))
    //             return false;
    //         return true;
    //     }

    //     private ApiAplication getEnclosingInstance() {
    //         return ApiAplication.this;
    //     }
}
