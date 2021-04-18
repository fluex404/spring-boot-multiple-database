package com.fluex404.springbootmultipledatabase.repo.db1;

import com.fluex404.springbootmultipledatabase.entity.db1.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
