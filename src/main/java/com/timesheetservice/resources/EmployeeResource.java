package com.timesheetservice.resources;

import com.timesheetservice.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> listar(){

        Employee employee1 = new Employee(1, "Marcos", "tecnico");
        Employee employee2 = new Employee(2, "Julio", "Analista");

        List<Employee> lista = new ArrayList<>();

        lista.add(employee1);
        lista.add(employee2);

        return lista;
    }

}
