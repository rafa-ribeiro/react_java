package br.com.rib.Rib.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by rafael on 19/10/17.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    // CommandLineRunner -> run after all the beans are created and registered.

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Rafael", "Ribeiro", "Java Developer"));
        this.repository.save(new Employee("William", "Pereira", "Risk Analyst"));
    }
}
