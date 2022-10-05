package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole=new RoleDTO(1L,"Admin");
        RoleDTO managerRole=new RoleDTO(1L,"Manager");
        RoleDTO employeeRole=new RoleDTO(1L,"Employee");
    }
}
