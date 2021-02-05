package main.dao;

import main.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HistoryDao {

    List<Operation> history = new ArrayList<>();

    public List<Operation> getHistory() {
        return history;
    }

    public void addOperationEntryToHistory (Operation operation) {
        history.add(operation);
    }
}