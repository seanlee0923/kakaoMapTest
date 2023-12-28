package com.kakaomap.kakaomaptest.kakaomap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakaomap.kakaomaptest.kakaomap.entity.TestBuilding;

public interface MyKakaoRepository extends JpaRepository<TestBuilding, Long> {
}
