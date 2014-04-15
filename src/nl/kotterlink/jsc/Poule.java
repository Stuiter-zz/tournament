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
		List<String> games = new ArrayList<String>();
		switch (numberOfTeams) {
		// total number of games is 1
		case 2:
			games.add(poule.get(0).getTeam() + " - " + poule.get(1).getTeam());
			break;
		// total number of games is 3
		case 3:
			games.add(poule.get(0).getTeam() + " - " + poule.get(1).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(2).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(2).getTeam());
			break;
		// total number of games is 6
		case 4:
			games.add(poule.get(0).getTeam() + " - " + poule.get(1).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(2).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(3).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(2).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(3).getTeam());
			games.add(poule.get(2).getTeam() + " - " + poule.get(3).getTeam());
			break;
		// total number of games is 10
		case 5:
			games.add(poule.get(0).getTeam() + " - " + poule.get(1).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(2).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(3).getTeam());
			games.add(poule.get(0).getTeam() + " - " + poule.get(4).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(2).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(3).getTeam());
			games.add(poule.get(1).getTeam() + " - " + poule.get(4).getTeam());
			games.add(poule.get(2).getTeam() + " - " + poule.get(3).getTeam());
			games.add(poule.get(2).getTeam() + " - " + poule.get(4).getTeam());
			games.add(poule.get(3).getTeam() + " - " + poule.get(4).getTeam());
			break;
		// total number of games is 0
		default:
			break;
		}

		System.out.println("This is poule: " + Poule.this.getPouleName());
		System.out
				.println("------------------------------------------------------------------------");
		for (int i = 0; i < games.size(); i++) {
			System.out.println(games.get(i) + i);
		}
		System.out.println();

	}
}
