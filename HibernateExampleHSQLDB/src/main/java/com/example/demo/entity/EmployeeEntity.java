package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "Employee")
public class EmployeeEntity implements Serializable
{
   private static final long serialVersionUID = -1798070786993154676L;
   @Id
   @Column(name = "ID", unique = true, nullable = false)
   private Integer employeeId;
   
   @Column(name = "NAME", unique = false, nullable = false, length = 100)
   private String name;  
 
   public Integer getEmployeeId()
   {
      return employeeId;
   }
 
   public void setEmployeeId(Integer employeeId)
   {
      this.employeeId = employeeId;
   }
 
   public String getName()
   {
      return name;
   }
 
   public void setName(String name)
   {
      this.name = name;
   }
}
