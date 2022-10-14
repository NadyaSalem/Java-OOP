package oop.reflectionExercises.p3BarracksWars.models.units;

import oop.reflectionExercises.p4BarracksWars.models.units.AbstractUnit;

public class Pikeman extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
