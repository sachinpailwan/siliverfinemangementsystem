package com.pailsom.sfms.repository;

import com.pailsom.sfms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(@RequestParam String userName);
}
