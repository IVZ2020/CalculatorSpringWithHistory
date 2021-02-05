package main.controller;

import main.entity.Operation;
import main.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class HistoryController {

    @Autowired
    HistoryService historyService;

    @GetMapping(path = "/history")
    public ModelAndView history (ModelAndView history) {
        List<Operation> his = historyService.getHistory();
        history.addObject("history", his);
        history.setViewName("history");
        return history;
    }
}