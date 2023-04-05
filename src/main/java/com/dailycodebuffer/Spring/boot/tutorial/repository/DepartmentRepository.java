/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodebuffer.Spring.boot.tutorial.repository;

import com.dailycodebuffer.Spring.boot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Deep Banerji
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
    public Department findBydepartmentName(String departmentName);
    public Department findBydepartmentNameIgnoreCase(String departmentName);
    
//    @Query(value = "Select * from Department where departmentName = ?1",nativeQuery = true) /* By default, nativeQuery = false meaning JPQL */
//    public Department findBydepartmentNameIgnoreCase(String departmentName);
    
}
