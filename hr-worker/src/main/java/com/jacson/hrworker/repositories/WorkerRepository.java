package com.jacson.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacson.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
