package com;

import java.util.HashSet;
import java.util.Random;

public class Card {

	private HashSet<Integer> cards;// 总牌
	private HashSet<Integer> mainCards = new HashSet<>(); // 地主牌

	public Card() {
		cards = new HashSet<>();
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
	}

	// 产生地主牌
	public void showLandlordCard() {
		Random random = new Random();
		while (true) {
			int temp = random.nextInt(54);
			// 抽出3个
			if (cards.contains(temp)) {
				System.out.println("地主牌：" + temp);
				mainCards.add(temp);
				cards.remove(temp);
			}
			if (mainCards.size() == 3) {
				break;
			}
		}
	}

	// 发牌
	public Player distributional(Player player) {
		Random random = new Random();
		for (;;) {
			if (this.cards.size() == 0) {
				break;
			}
			int temp = random.nextInt(54);
			if (!cards.contains(temp)) {
				continue;
			}

			player.getHandCards().add(temp);
			this.cards.remove(temp);
			if (player.getHandCards().size() == 17) {
				break;
			}
		}
		return player;
	}

	public HashSet<Integer> getMainCards() {
		return mainCards;
	}

	public void setMainCards(HashSet<Integer> mainCards) {
		this.mainCards = mainCards;
	}

	public HashSet<Integer> getCards() {
		return cards;
	}

	public void setCards(HashSet<Integer> cards) {
		this.cards = cards;
	}
}
