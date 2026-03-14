package com.company.departmentservice.service;

import com.company.departmentservice.dto.DepartmentCreateDTO;
import com.company.departmentservice.entity.Department;
import com.company.departmentservice.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

 
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImplementation implements DepartmentService{

    private  final DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(DepartmentCreateDTO departmentDto){
        Department department = new Department();
        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setDepartmentCode(departmentDto.getDepartmentCode());
        department.setDepartmentDescription(departmentDto.getDepartmentDescription());

        return departmentRepository.save(department);
    }

    // Update the return type and method name to match the DepartmentService interface
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
