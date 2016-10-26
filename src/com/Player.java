package com;

import java.util.HashSet;

public class Player {

	private String name;


	private HashSet<Integer> handCards = new HashSet<>();
	
	

	public Player() {
		super();
	}

	public Player(String name) {
		super();
		this.name = name;
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<Integer> getHandCards() {
		return handCards;
	}

	public void setHandCards(HashSet<Integer> handCards) {
		this.handCards = handCards;
	}

}
