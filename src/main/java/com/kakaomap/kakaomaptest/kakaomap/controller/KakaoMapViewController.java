package com.kakaomap.kakaomaptest.kakaomap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KakaoMapViewController {
	@RequestMapping("/")
	public String toKakaoMap(){
		return "kakaomap/defaultMap";
	}
	@RequestMapping("/search")
	public String toSearchKakaoMap(){
		return "kakaomap/map";
	}
}
