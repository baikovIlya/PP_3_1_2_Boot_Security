package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleService {
    void saveRole(Role role);
    Role getRoleByName(String roleName);

}
