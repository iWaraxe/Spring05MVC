package com.coherentsolutions.spring.mvc.forms;

import com.coherentsolutions.spring.mvc.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller //special component
public class InputController {
    @RequestMapping("/askInputDetails")
    public String askInputDetails(Model model) {

        Employee emp = new Employee();
        emp.setName("Igor");
        emp.setSurname("Waraxe");
        emp.setSalary(500);

        model.addAttribute("employee", new Employee());
        return "ask-input-details";
    }

    @RequestMapping("/showInputDetails")
    public String showInputDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "ask-input-details";
        } else {
            String name = employee.getName();
            employee.setName("Mr " + name);

            String surname = employee.getSurname();
            employee.setSurname(surname + "!");

            int salary = employee.getSalary();
            employee.setSalary(salary * 10);

            return "show-input-details";
        }
    }
}

/* Hardcorded values in departments
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>

    BMW <form:radiobutton path="carBrand" value="BMW"/>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>

    EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="German"/>
    FR <form:checkbox path="languages" value="French"/>
*/
