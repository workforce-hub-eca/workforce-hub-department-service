package com.workforcehub.departmentservice.service.impl;

import com.workforcehub.departmentservice.dto.DepartmentDTO;
import com.workforcehub.departmentservice.entity.Department;
import com.workforcehub.departmentservice.exception.ResourceNotFoundException;
import com.workforcehub.departmentservice.repository.DepartmentRepository;
import com.workforcehub.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department(null, departmentDTO.getName(), departmentDTO.getDescription());
        Department savedDepartment = departmentRepository.save(department);
        return new DepartmentDTO(savedDepartment.getId(), savedDepartment.getName(), savedDepartment.getDescription());
    }

    @Override
    public DepartmentDTO getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));
        return new DepartmentDTO(department.getId(), department.getName(), department.getDescription());
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(dept -> new DepartmentDTO(dept.getId(), dept.getName(), dept.getDescription()))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));
        department.setName(departmentDTO.getName());
        department.setDescription(departmentDTO.getDescription());
        Department updatedDepartment = departmentRepository.save(department);
        return new DepartmentDTO(updatedDepartment.getId(), updatedDepartment.getName(), updatedDepartment.getDescription());
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));
        departmentRepository.delete(department);
    }
}
