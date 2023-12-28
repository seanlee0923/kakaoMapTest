package com.kakaomap.kakaomaptest.kakaomap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kakaomap.kakaomaptest.kakaomap.dto.TestBuildingDTO;
import com.kakaomap.kakaomaptest.kakaomap.entity.TestBuilding;
import com.kakaomap.kakaomaptest.kakaomap.repository.TestBuildingRepository;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalcServiceImpl implements CalcService{
	private final TestBuildingRepository testBuildingRepository;
	@Override
	public List<TestBuildingDTO> getByDistance(double latitude, double longitude) {
		return null;
	}

	@Override
	public void save(TestBuildingDTO saveDto) {
		testBuildingRepository.save(TestBuilding.from(saveDto));
	}

	// 최단거리 구하기, 하버사인 공식(Haversine Formula)
	private double calculateDistance(double lat1, double lon1, double lat2, double lon2) { // 현재lat, 현재lon, 계산할lat, 계산할lon
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);

		double earthRadius = 6371; //Kilometers - 지구의 반지름
		return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2)
			+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
	}

}
