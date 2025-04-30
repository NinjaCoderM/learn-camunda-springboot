package at.codecrafters.camunda.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value="/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping(value="/execute")
    public String execute(){
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("first_bpmn_execute");
        instance.executeWithVariablesInReturn();

        return "BPMN has executed";
    }
}
