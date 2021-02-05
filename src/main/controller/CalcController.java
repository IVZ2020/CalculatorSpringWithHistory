package main.controller;

import main.dao.HistoryDao;
import main.entity.Operation;
import main.service.CalcService;
import main.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class CalcController {
    @Autowired
    private CalcService calcService;
    @Autowired
    private HistoryService historyService;

    @PostMapping(path = "/calc")
    public ModelAndView calcAction(int num1, int num2, String operation, ModelAndView calc) {
        Operation op = calcService.createOperationEntry(num1, num2, operation);
        Operation oper = calcService.calc(op);
        calc.addObject("result", oper.result);
        calc.setViewName("calc");
        historyService.addOperationEntryToHistory(oper);
        return calc;
    }

    @GetMapping(path = "/calc")
    public String calcView() {
        return "calc";
    }
}