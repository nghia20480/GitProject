
public class Calculator {
    public static float calculate(float firstOperand, float SecondOperand,char operator){
        switch (operator){
            case '+':
                return  firstOperand + SecondOperand;
            case '-':
                return firstOperand - SecondOperand;
            case '*':
            return firstOperand*SecondOperand;
            case '/':
                if (SecondOperand!=0)
                return firstOperand/SecondOperand;
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("invalid operation");

        }
    }
}
