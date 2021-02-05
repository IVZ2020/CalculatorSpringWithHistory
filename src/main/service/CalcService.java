package main.service;

import main.dao.CalcDao;
import main.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalcService {

    public Operation createOperationEntry(int num1, int num2, String operation) {
        return new Operation(num1, num2, operation);
    }

    public Operation calc(Operation operation) {
        int num1 = operation.num1;
        int num2 = operation.num2;
        String res;
        Operation result;
        switch (operation.operation) {
            case "+":
                res = Double.toString(num1 + num2);
                break;
            case "-":
                res = Double.toString(num1 - num2);
                break;
            case "/" :
                if (num2 == 0) res = "No division on null";
                else  res = Double.toString(num1 / num2);
                break;
            case "*":
                res = Double.toString(num1 * num2);
                break;
            default:
                res = "Mistake";
        }
        return new Operation(num1, num2, operation.operation,res);
    }

}
