package at.codecrafters.camunda.javaDelegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class JavaDelegateExpressionExample implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Comming From JavaDelegateExpressionExample");
        System.out.println(">>>>>>>>>" + delegateExecution.getVariable("outputVal"));
        System.out.println(">>>>>>>>>" + delegateExecution.getVariables());
        delegateExecution.setVariable("userRole", "Developer");
    }
}
