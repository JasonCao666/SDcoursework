package com.cjh.entity;

import java.util.ArrayList;
import java.util.List;


public class Squad {

	private String name;

	private Captain captain;

	private Hierophant hierophant;

	private List<Member> memberList = new ArrayList<Member>(8);

	public Squad(String name){
		this.name=name;
		for(int i=0;i<8;i++){
			memberList.add(null);
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}

	public Hierophant getHierophant() {
		return hierophant;
	}

	public void setHierophant(Hierophant hierophant) {
		this.hierophant = hierophant;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public void setSingleMember(Member member, int index){
		this.getMemberList().remove(index);
		this.getMemberList().add(index, member);
	}
	public void removeSingleMember(Member member, int index){
		this.getMemberList().remove(index);
		this.getMemberList().add(index, null);
	}
	
	
	
	
	
}
