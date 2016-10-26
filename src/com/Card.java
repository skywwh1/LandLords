package com;

import java.util.HashSet;
import java.util.Random;

public class Card {

	private HashSet<Integer> cards;// ����
	private HashSet<Integer> mainCards = new HashSet<>(); // ������

	public Card() {
		cards = new HashSet<>();
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
	}

	// ����������
	public void showLandlordCard() {
		Random random = new Random();
		while (true) {
			int temp = random.nextInt(54);
			// ���3��
			if (cards.contains(temp)) {
				System.out.println("�����ƣ�" + temp);
				mainCards.add(temp);
				cards.remove(temp);
			}
			if (mainCards.size() == 3) {
				break;
			}
		}
	}

	// ����
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
