package com;

import java.util.LinkedList;

public class Play {

	private int players; // ����

	private int packs; // ����

	public void start() {
		// �����
		Player player1 = new Player("No.1--");
		Player player2 = new Player("No.2--");
		Player player3 = new Player("No.3--");
		LinkedList<Player> queue = new LinkedList<>();
		queue.add(player1);
		queue.add(player2);
		queue.add(player3);

		//����
		Card card = new Card();

		for (Player p : queue) {
			card.distributional(p);
		}

		displayCards(queue);
		
		System.out.println("============��ʼ������=============");
		//������
		for (Player p : queue) {
			p.catchLandLord(p);
			if (p.getIsCatch() == 1) {
				//�����������ѵ����ƼӸ���
				p.getHandCards().addAll(card.getCards());
				break;
			}
		}
		System.out.println("");
		System.out.println("============��ʾ������=============");
		card.showLandlordCard();
		
		
		System.out.println("");
		System.out.println("============��ʾ�����=============");
		
		displayCards(queue);
		
	}

	public static void main(String[] args) {
		Play p = new Play();
		p.start();
	}
	
	public void displayCards(LinkedList<Player> queue) {
		for (Player p : queue) {
			if (p.getIsCatch()==1) {
				System.out.println(p.getName()+"  : ���ǵ��� ========");
			}else {
				
				System.out.println(p.getName()+"  : ����� ========");
			}
			for (Integer i : p.getHandCards()) {
				System.out.print(i+",");
			}
			System.out.println("");
			System.out.println("");
		}
	}
}
