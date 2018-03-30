package com.cjh.entity;


public class Hierophant {

	private int id;

	private String name;

	private String  describe;

	private int move;

	private String combatType;

	private int comatEffectiveness;

	private int guard;

	private int hp;

	private int exp;

	private SpecialismTree specialismTree;

	private Weapon[] weapon = new Weapon[2];

	private Cloth Cloth;

	private Accessories accessories;

	private int skillPoint;

	private int price;

	public Hierophant(String name){
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
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public SpecialismTree getSpecialismTree() {
		return specialismTree;
	}
	public void setSpecialismTree(SpecialismTree specialismTree) {
		this.specialismTree = specialismTree;
	}
	public Weapon[] getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon[] weapon) {
		this.weapon = weapon;
	}
	public Cloth getCloth() {
		return Cloth;
	}
	public void setCloth(Cloth cloth) {
		Cloth = cloth;
	}
	public Accessories getAccessories() {
		return accessories;
	}
	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}
	public int getSkillPoint() {
		return skillPoint;
	}
	public void setSkillPoint(int skillPoint) {
		this.skillPoint = skillPoint;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
