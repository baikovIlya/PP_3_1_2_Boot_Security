package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class RoleDaoImpl implements RoleDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void addRole(Role role) {
        em.persist(role);
    }

    @Transactional
    @Override
    public List<Role> getRoles() {
        return em.createQuery("select r from Role r", Role.class).getResultList();
    }

    @Transactional
    @Override
    public Role getRoleByName(String role) {
        Query query = em.createQuery("SELECT r FROM Role r WHERE r.role = : role");
        query.setParameter("role", role);
        return (Role) query.getSingleResult();
    }
}
