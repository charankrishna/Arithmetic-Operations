package controller;



import models.Variables;
import models.Variables1;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;


@RestController
@RequestMapping("/home")

public class calculatorController {

        @PostMapping(value = "/add")
        public String getVariables(@RequestBody Variables variables){
            HashMap<String, Integer> map = new HashMap<>();
            Variables aa = new Variables();
            int a = Integer.parseInt(variables.getA());
            int b = Integer.parseInt(variables.getB());
            int result = a + b;
            map.put("Result", result);
            aa.setResult(result);
            return map.toString();
        }

        @PostMapping(value = "/sub")
        public String getVariables1(@RequestBody Variables1 sub){
            HashMap<String, Integer> map = new HashMap<>();
            Variables1 aaa = new Variables1();
            int a = Integer.parseInt(sub.getA());
            int b = Integer.parseInt(sub.getB());
            int result = a - b;
            map.put("Result", result);
            aaa.setResult(result);
            return map.toString();
        }
}