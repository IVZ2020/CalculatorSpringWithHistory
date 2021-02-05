package main.dao;

import main.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Session {

    List<Operation> operationList;

    public void session(List<Operation> operations) {
        this.operationList = operations;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList (Operation action){
    this.operationList = operationList;
    }

    public void addOperationToListInSession(Operation operation) {
        operationList.add(operation);
    }
}
