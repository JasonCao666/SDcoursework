package com.cjh.entity;

import java.util.ArrayList;
import java.util.List;


public class Player {


	private String name;

	private List<Squad> squadList = new ArrayList<Squad>();

	private List<Captain> captainList= new ArrayList<Captain>();

	private List<Hierophant> hierophantList= new ArrayList<Hierophant>();

	private List<Member> memberList= new ArrayList<Member>();

	private List<Weapon> weaponList =new ArrayList<Weapon>();

	public Player(String name){
		this.name=name;

	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Squad> getSquadList() {
		return squadList;
	}
	public void setSquadList(List<Squad> squadList) {
		this.squadList = squadList;
	}

	public List<Captain> getCaptainList() {
		return captainList;
	}

	public void setCaptainList(List<Captain> captainList) {
		this.captainList = captainList;
	}

	public List<Hierophant> getHierophantList() {
		return hierophantList;
	}

	public void setHierophantList(List<Hierophant> hierophantList) {
		this.hierophantList = hierophantList;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public List<Weapon> getWeaponList() {
		return weaponList;
	}

	public void setWeaponList(List<Weapon> weaponList) {
		this.weaponList = weaponList;
	}
}
