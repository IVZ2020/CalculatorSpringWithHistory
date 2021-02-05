package main.service;

import main.dao.CalcDao;
import main.dao.HistoryDao;
import main.dao.Session;
import main.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoryService {
    @Autowired
    HistoryDao historyDao;

    public List<Operation> getHistory () {
        return historyDao.getHistory();
    }

    public void addOperationEntryToHistory (Operation operation) {
        historyDao.addOperationEntryToHistory(operation);
    }
}