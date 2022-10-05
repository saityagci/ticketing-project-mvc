package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    RoleService roleService;

    public DataGenerator(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole=new RoleDTO(1L,"Admin");
        RoleDTO managerRole=new RoleDTO(1L,"Manager");
        RoleDTO employeeRole=new RoleDTO(1L,"Employee");
        // add data to MAP

    }
}
