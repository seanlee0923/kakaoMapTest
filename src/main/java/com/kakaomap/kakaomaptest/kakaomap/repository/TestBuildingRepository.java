package com.kakaomap.kakaomaptest.kakaomap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakaomap.kakaomaptest.kakaomap.entity.TestBuilding;

public interface TestBuildingRepository extends JpaRepository<TestBuilding, Long> {
    java.util.List<TestBuilding> findByNameContains(String keyword);
}
