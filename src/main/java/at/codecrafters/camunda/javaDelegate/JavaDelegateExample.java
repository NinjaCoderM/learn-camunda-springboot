package at.codecrafters.camunda.javaDelegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class JavaDelegateExample implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Comming From JavaDelegateExample");
        System.out.println("Input: " + delegateExecution.getVariable("inputVal"));
        delegateExecution.setVariable("outputVal", "... Lauf Forest Gump ...");
    }
}
