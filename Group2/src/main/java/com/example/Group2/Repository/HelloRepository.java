package com.example.Group2.Repository;

import com.example.Group2.Entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello,Long>
{

}
