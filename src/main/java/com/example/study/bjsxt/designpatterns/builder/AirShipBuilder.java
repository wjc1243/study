package com.example.study.bjsxt.designpatterns.builder;


public interface AirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower  builderEscapeTower();
}
