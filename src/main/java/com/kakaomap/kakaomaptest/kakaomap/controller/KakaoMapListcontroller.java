package com.kakaomap.kakaomaptest.kakaomap.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kakaomap.kakaomaptest.kakaomap.dto.TestBuildingDTO;
import com.kakaomap.kakaomaptest.kakaomap.service.CalcService;
import com.sun.tools.jconsole.JConsoleContext;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class KakaoMapListcontroller {
	@Autowired
	CalcService calcService;
	@GetMapping("/nearByHospitals")
	public String searchHospitals(double x, double y){
		List<TestBuildingDTO> getByDistance = calcService.getByDistance(x, y);
		log.info("{}",getByDistance);
		return getByDistance.toString();
	}

	@PostMapping("/save-dummy")
	public void insertDummyData(@RequestBody List<TestBuildingDTO> dtoList){
		dtoList.forEach(dto -> {
			calcService.save(dto);
		});
	}
}
