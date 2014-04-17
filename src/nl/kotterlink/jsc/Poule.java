package nl.kotterlink.jsc;

import java.util.ArrayList;
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
		int numberOfTeams = poule.size();
		List<Game> games = new ArrayList<Game>();
		switch (numberOfTeams) {
		// total number of games is 1
		case 2:
			games.add(new Game(poule.get(0), poule.get(1)));

			break;
		// total number of games is 3
		case 3:
			games.add(new Game(poule.get(0), poule.get(1)));
			games.add(new Game(poule.get(0), poule.get(2)));
			games.add(new Game(poule.get(1), poule.get(2)));
			break;
		// total number of games is 6
		case 4:
			games.add(new Game(poule.get(0), poule.get(1)));
			games.add(new Game(poule.get(0), poule.get(2)));
			games.add(new Game(poule.get(0), poule.get(3)));
			games.add(new Game(poule.get(1), poule.get(2)));
			games.add(new Game(poule.get(1), poule.get(3)));
			games.add(new Game(poule.get(2), poule.get(3)));
			break;
		// total number of games is 10
		case 5:
			games.add(new Game(poule.get(0), poule.get(1)));
			games.add(new Game(poule.get(0), poule.get(2)));
			games.add(new Game(poule.get(0), poule.get(3)));
			games.add(new Game(poule.get(0), poule.get(4)));
			games.add(new Game(poule.get(1), poule.get(2)));
			games.add(new Game(poule.get(1), poule.get(3)));
			games.add(new Game(poule.get(1), poule.get(4)));
			games.add(new Game(poule.get(2), poule.get(3)));
			games.add(new Game(poule.get(2), poule.get(4)));
			games.add(new Game(poule.get(3), poule.get(4)));
			break;
		// total number of games is 0
		default:
			break;
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
