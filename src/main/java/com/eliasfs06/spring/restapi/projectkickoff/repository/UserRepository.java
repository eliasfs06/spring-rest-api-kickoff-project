package com.eliasfs06.spring.restapi.projectkickoff.repository;

import com.eliasfs06.spring.restapi.projectkickoff.model.User;

public interface UserRepository extends GenericRepository<User> {
    User findByUsername(String username);
}
