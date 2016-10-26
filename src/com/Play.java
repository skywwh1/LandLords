package com;

import java.util.LinkedList;

public class Play {

	private int players; // 人数

	private int packs; // 牌数

	public void start() {
		// 分牌
		Player player1 = new Player("No.1--");
		Player player2 = new Player("No.2--");
		Player player3 = new Player("No.3--");

		Card card = new Card();
		card.showLandlordCard();
		LinkedList<Player> queue = new LinkedList<>();
		queue.add(player1);
		queue.add(player2);
		queue.add(player3);

		for (Player p : queue) {
			card.distributional(p);
		}

		System.out.println(player1.getName() + "======================");
		for (Integer i : player1.getHandCards()) {
			System.out.println(i);
		}
		System.out.println(player2.getName() + "======================");
		for (Integer i : player2.getHandCards()) {
			System.out.println(i);
		}
		System.out.println(player3.getName() + "======================");
		for (Integer i : player3.getHandCards()) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Play p = new Play();
		p.start();
	}
}
