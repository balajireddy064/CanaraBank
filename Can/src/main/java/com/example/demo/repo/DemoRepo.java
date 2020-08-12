package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DemoEntity;

public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {

}
