package com.rfm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rfm.pojo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
