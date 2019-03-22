package za.co.fenya.tlala.fenyatlala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.fenya.tlala.fenyatlala.domain.Employee;
import za.co.fenya.tlala.fenyatlala.dto.EmployeeDetailsDTO;
import za.co.fenya.tlala.fenyatlala.repository.EmployeeRepository;


import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void creatorUpdate(EmployeeDetailsDTO employeeDetailsDTO){

    }

    @Override
    public List<EmployeeDetailsDTO> getEmloyees() {
        List<Employee>  employeeList = employeeRepository.findAll();
        return null;
    }
}
