package com.example.tp2_sec_log.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("select u.Username from User u where u.Username=:Username")
    User find(@Param("Username") String Username);
}