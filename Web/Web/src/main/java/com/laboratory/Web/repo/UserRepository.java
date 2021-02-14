package com.laboratory.Web.repo;

import com.laboratory.Web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    static User findByUsername(String username) {
        return null;
    }
}
