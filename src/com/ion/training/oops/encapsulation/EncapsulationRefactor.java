package com.ion.training.oops.encapsulation;

class CricketScoreRefactor {
	private int score = 0;
	private int countFours = 0;
	private int countSixes = 0;

	public int getScore() {
		return score;
	}

	private void addRuns(int score) {
		this.score = this.score + score;
		printScore();
	}

	public void six() {
		addRuns(6);
		countSixes++;
	}

	public void four() {
		addRuns(4);
		countFours++;
	}

	public void single() {
		addRuns(1);
	}

	private void printScore() {
		System.out.println("Score : " + score + "Four Count" + countFours + "Sixes Count -"+ countSixes);
	}

}

public class EncapsulationRefactor {
	public static void main(String[] args) {
		CricketScoreRefactor scorer = new CricketScoreRefactor();
		scorer.four();
		scorer.four();
		scorer.single();
		scorer.six();
		scorer.six();
		scorer.six();
	}
}
