package com.techreturners.cats;


interface Cat {

	boolean isAsleep();

	String getSetting();

	int getAverageHeight();

	String eat();

	void goToSleep();

	void wakeUp();

}

abstract class CommonCat implements Cat {
	private boolean sleep;

	@Override
	public boolean isAsleep() {
		return sleep;
	}

	@Override
	public void goToSleep() {
		sleep = true;
	}

	@Override
	public void wakeUp() {
		sleep = false;
	}

	@Override
	public abstract String getSetting();

	@Override
	public abstract String eat();

	@Override
	public abstract int getAverageHeight();

}

class DomesticCat extends CommonCat {
	@Override
	public String getSetting() {
		return "domestic";
	}

	@Override
	public String eat() {
		return "Purrrrrrr";
	}

	@Override
	public int getAverageHeight() {
		return 23;
	}

}

class LionCat extends CommonCat {

	@Override
	public String getSetting() {
		return "lion";
	}

	@Override
	public int getAverageHeight() {
		return 1100;
	}

	@Override
	public String eat() {
		return "Roar!!!!";
	}

}

class CheetahCat extends CommonCat {

	@Override
	public String getSetting() {
		return "cheetah";
	}

	@Override
	public int getAverageHeight() {
		return 900;
	}

	@Override
	public String eat() {
		return "Zzzzzzz";
	}

}
