package br.com.rib.Rib.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafael on 19/10/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    // CrudRepository<Employee, Long> linka a entidade do repositório e Long é o tipo da PK da entidade

    Employee findByLastName(String lastName);

}
