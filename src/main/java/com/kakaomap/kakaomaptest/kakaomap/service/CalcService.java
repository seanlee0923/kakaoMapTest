package com.kakaomap.kakaomaptest.kakaomap.service;

import java.util.List;

import com.kakaomap.kakaomaptest.kakaomap.dto.TestBuildingDTO;

public interface CalcService {
	List<TestBuildingDTO> getByDistance(double latitude, double longitude);
	void save(TestBuildingDTO saveDto);

	List<TestBuildingDTO> getByKeyword(String keyword);
}
