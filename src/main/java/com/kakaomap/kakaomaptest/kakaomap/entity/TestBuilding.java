package com.kakaomap.kakaomaptest.kakaomap.entity;

import com.kakaomap.kakaomaptest.kakaomap.dto.TestBuildingDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "test_building")

@Builder
public class TestBuilding {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String address;
	private double latitude;
	private double longitude;
	private double distance;

	public TestBuilding from(TestBuildingDTO dto){
		return TestBuilding.builder()
			.name(dto.getName())
			.address(dto.getAddress())
			.longitude(dto.getLongitude())
			.latitude(dto.getLatitude())
			.build();
	}
}
