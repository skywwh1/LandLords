package com;

import java.util.LinkedList;

public class Play {

	private int players; // 人数

	private int packs; // 牌数

	public void start() {
		// 分玩家
		Player player1 = new Player("No.1--");
		Player player2 = new Player("No.2--");
		Player player3 = new Player("No.3--");
		LinkedList<Player> queue = new LinkedList<>();
		queue.add(player1);
		queue.add(player2);
		queue.add(player3);

		//分牌
		Card card = new Card();

		for (Player p : queue) {
			card.distributional(p);
		}

		displayCards(queue);
		
		System.out.println("============开始抢地主=============");
		//抢地主
		for (Player p : queue) {
			p.catchLandLord(p);
			if (p.getIsCatch() == 1) {
				//抢到地主，把地主牌加给它
				p.getHandCards().addAll(card.getCards());
				break;
			}
		}
		System.out.println("");
		System.out.println("============显示地主牌=============");
		card.showLandlordCard();
		
		
		System.out.println("");
		System.out.println("============显示玩家牌=============");
		
		displayCards(queue);
		
	}

	public static void main(String[] args) {
		Play p = new Play();
		p.start();
	}
	
	public void displayCards(LinkedList<Player> queue) {
		for (Player p : queue) {
			if (p.getIsCatch()==1) {
				System.out.println(p.getName()+"  : 我是地主 ========");
			}else {
				
				System.out.println(p.getName()+"  : 玩家牌 ========");
			}
			for (Integer i : p.getHandCards()) {
				System.out.print(i+",");
			}
			System.out.println("");
			System.out.println("");
		}
	}
}
