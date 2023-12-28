package com.kakaomap.kakaomaptest.kakaomap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
public class KakaoMapListcontroller {
	@GetMapping("/nearByHospitals")
	public String searchHospitals(double x, double y){
		return x+","+y;
	}
}
