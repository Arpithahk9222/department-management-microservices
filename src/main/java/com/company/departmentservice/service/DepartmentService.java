package com.company.departmentservice.service;


import java.util.List;

import com.company.departmentservice.dto.DepartmentCreateDTO;
import com.company.departmentservice.entity.Department;

public interface DepartmentService {
    public Department createDepartment(DepartmentCreateDTO departmentDto);
    public List<Department> getAllDepartments();
}
