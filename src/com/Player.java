package com;

import java.util.HashSet;
import java.util.Scanner;

public class Player {

	private String name;
	private int isCatch = 0;

	private HashSet<Integer> handCards = new HashSet<>();
	
	

	public Player() {
		super();
	}

	public Player(String name) {
		super();
		this.name = name;
		System.out.println(this.name);
	}

	//ÇÀµØÖ÷
	public boolean catchLandLord(Player player){
		Scanner scanner = new Scanner(System.in);
		player.setIsCatch(scanner.nextInt());
		if (player.getIsCatch() == 1)
			return true;
		return false;
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

	public int getIsCatch() {
		return isCatch;
	}

	public void setIsCatch(int isCatch) {
		this.isCatch = isCatch;
	}

}
