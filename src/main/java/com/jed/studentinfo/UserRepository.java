package com.jed.studentinfo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("from User where name like %:keyword%")
    List<User> search(@Param("keyword") String keyword);
}