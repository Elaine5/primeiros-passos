package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(int number1, int number2){
        return number1+number2;
    }
}
