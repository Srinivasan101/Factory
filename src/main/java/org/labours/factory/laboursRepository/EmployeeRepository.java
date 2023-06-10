package org.labours.factory.laboursRepository;

import org.labours.factory.employeeEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee , Integer> {

}
