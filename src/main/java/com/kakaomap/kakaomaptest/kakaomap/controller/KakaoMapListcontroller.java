package com.kakaomap.kakaomaptest.kakaomap.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kakaomap.kakaomaptest.kakaomap.dto.TestBuildingDTO;
import com.kakaomap.kakaomaptest.kakaomap.service.CalcService;
import com.sun.tools.jconsole.JConsoleContext;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oracle.net.aso.k;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Slf4j
public class KakaoMapListcontroller {
	@Autowired
	CalcService calcService;
	@GetMapping("/nearByHospitals")
	public ResponseEntity<List<TestBuildingDTO>> searchHospitals(double x, double y){
		List<TestBuildingDTO> getByDistance = calcService.getByDistance(x, y);
		log.info("{}",getByDistance);
		return ResponseEntity.status(HttpStatus.OK).body(getByDistance);
	}

	@PostMapping("/save-dummy")
	public void insertDummyData(@RequestBody List<TestBuildingDTO> dtoList){
		dtoList.forEach(dto -> {
			calcService.save(dto);
		});
	}

	@GetMapping("/hospitals/{keyword}")
	public ResponseEntity<List<TestBuildingDTO>> getMethodName(@PathVariable String keyword) {
		List<TestBuildingDTO> getByKeywords = calcService.getByKeyword(keyword);
		return ResponseEntity.status(HttpStatus.OK).body(getByKeywords);
	}
	
}
