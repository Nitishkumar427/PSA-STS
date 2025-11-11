package com.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
