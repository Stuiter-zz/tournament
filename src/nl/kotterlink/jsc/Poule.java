package nl.kotterlink.jsc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Poule {

	private String pouleName;
	private List<Team> poule = new ArrayList<Team>();

	public Poule(String pouleName) {
		this.pouleName = pouleName;
	}

	public void addTeam(Team team) {
		this.poule.add(team);
	}

	public String getPouleName() {
		return pouleName;
	}

	@Override
	public String toString() {
		return "Poule [pouleName=" + pouleName + ", poule=" + poule + "]";
	}

	public void printPoule() {
		System.out.println("Poule Name: " + pouleName);
		for (Team team : poule) {
			System.out.println(team);
		}
		System.out.println();
	}

	public void numberOfGames() {
		List<Game> games = new ArrayList<Game>();
		
		for (int i = 0; i < poule.size(); i++) {
			for (int j = i+1; j < poule.size(); j++) {
//				System.out.println(i + " + " + (j));
				games.add(new Game(poule.get(i), poule.get(j)));
			}
		}
		
		System.out.println("This is poule: " + Poule.this.getPouleName());
		System.out
				.println("------------------------------------------------------------------------");
		for (int i = 0; i < games.size(); i++) {
			games.get(i).printGame();
		}
		System.out.println();

	}
}
