package at.codecrafters.camunda.service;

import org.springframework.stereotype.Component;

@Component
public class UserDepartmentService {
    public String getUserDepartment(){
        System.out.println("getUserDepartment");
        return "Dev - Secure Archives";
    }
}
