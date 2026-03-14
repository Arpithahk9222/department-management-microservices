package com.company.departmentservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.departmentservice.dto.DepartmentCreateDTO;
import com.company.departmentservice.entity.Department;
import com.company.departmentservice.service.DepartmentService;
 
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> createDepartment(@Valid @RequestBody DepartmentCreateDTO departmentDto) {
        return ResponseEntity.ok(departmentService.createDepartment(departmentDto));
    }

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
            return ResponseEntity.ok(departmentService.getAllDepartments());
        }
}
