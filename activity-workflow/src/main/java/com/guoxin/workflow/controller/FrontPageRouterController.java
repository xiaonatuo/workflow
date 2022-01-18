package com.guoxin.workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 */
@Controller
public class FrontPageRouterController {

    @GetMapping("/logicflow")
    public String logicFlowIndex(){
        return "logicflow/index";
    }
}
