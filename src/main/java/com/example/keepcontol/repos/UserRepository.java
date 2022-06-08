package com.example.keepcontol.repos;

import com.example.keepcontol.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
