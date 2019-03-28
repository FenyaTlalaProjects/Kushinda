package za.co.fenya.tlala.fenyatlala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.fenya.tlala.fenyatlala.dto.EmployeeDetailsDTO;
import za.co.fenya.tlala.fenyatlala.service.EmployeeService;


import java.util.Collections;
import java.util.List;

@RestController
public class HumanResourceController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/saveOrUpdate", consumes = "application/json", method = RequestMethod.POST)
    public void creatorUpdateEmployee(@RequestBody EmployeeDetailsDTO employeeDetailsDTO){
            employeeService.creatorUpdate(employeeDetailsDTO);
    }

    public EmployeeDetailsDTO searchEmployee(@RequestParam long id){
        return null;
    }

    public List<EmployeeDetailsDTO> getEmployees(){
        return employeeService.getEmloyees();
   }
}
