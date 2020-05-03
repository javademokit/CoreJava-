package com.javasampleapproach.rabbitmq.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MessageRepo extends JpaRepository<Messagemodel, Integer>{
}

