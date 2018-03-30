package com.cjh.entity;


public class Member {

	private int id;

	private String name;

	private String  describe;

	private int move;

	private String combatType;

	private int comatEffectiveness;

	private int guard;

	private int hp;

	private int morale;

	private int price;

	public Member(String name){
		this.name=name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getMove() {
		return move;
	}
	public void setMove(int move) {
		this.move = move;
	}
	public String getCombatType() {
		return combatType;
	}
	public void setCombatType(String combatType) {
		this.combatType = combatType;
	}
	public int getComatEffectiveness() {
		return comatEffectiveness;
	}
	public void setComatEffectiveness(int comatEffectiveness) {
		this.comatEffectiveness = comatEffectiveness;
	}
	public int getGuard() {
		return guard;
	}
	public void setGuard(int guard) {
		this.guard = guard;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMorale() {
		return morale;
	}
	public void setMorale(int morale) {
		this.morale = morale;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
