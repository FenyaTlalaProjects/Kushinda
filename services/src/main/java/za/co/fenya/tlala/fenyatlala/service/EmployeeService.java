package za.co.fenya.tlala.fenyatlala.service;

import za.co.fenya.tlala.fenyatlala.dto.EmployeeDetailsDTO;

import java.util.List;

public interface EmployeeService {
    public void creatorUpdate(EmployeeDetailsDTO employeeDetailsDTO);
    public List<EmployeeDetailsDTO> getEmloyees();
}
