package com.example.securitydemo.repository;

import com.example.securitydemo.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege,Integer> {
    Privilege findByName(String name);
}
