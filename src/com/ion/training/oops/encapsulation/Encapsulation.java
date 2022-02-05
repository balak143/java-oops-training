package com.ion.training.oops.encapsulation;

class CricketScore {
	private int score = 0;
	public void printScore() {
		System.out.println("Score : " + score);
	}

	public int getScore() {
		return this.score;
	}
	private void addRun(int score){
		//validate
		this.score = score;
	}

	public void six(int score){
		addRun(score);

	}

	public void four(int score){
		addRun(score);

	}

}

public class Encapsulation{
	public static void main(String[] args) {
		CricketScore scorer = new CricketScore();
		/*scorer.add(4);
		scorer.setScore(-1);
		scorer.printScore();
		scorer.score += 6;
		scorer.printScore();
		scorer.score += 1;*/
		scorer.printScore();


	}
}
