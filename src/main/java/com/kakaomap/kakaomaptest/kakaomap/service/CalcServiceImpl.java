package com.kakaomap.kakaomaptest.kakaomap.service;

public class CalcServiceImpl {
	// 최단거리 구하는 메소드
	private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);

		double earthRadius = 6371; //Kilometers - 지구의 반지름
		return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2)
			+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
	}
}
