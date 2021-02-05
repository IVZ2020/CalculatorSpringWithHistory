package main.dao;

import main.entity.Operation;
import main.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalcDao  {
    @Autowired
    HistoryDao historyDao;

    public void addOperationEntryToHistory (Operation operation) {
        historyDao.addOperationEntryToHistory(operation);
    }
}


