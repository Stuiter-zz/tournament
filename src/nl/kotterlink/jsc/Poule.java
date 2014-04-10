package nl.kotterlink.jsc;

import java.util.ArrayList;
import java.util.List;

public class Poule {

	private String pouleName;
	private List<Team> poule = new ArrayList<Team>();

	public List<Team> getPoule() {
		return poule;
	}

	public void setPoule(List<Team> poule) {
		this.poule = poule;
	}

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

	public int numberOfGames() {
		int numberOfTeams = poule.size();
		int numberOfGames;
		switch (numberOfTeams) {
			case 2:		numberOfGames = 1;
						break;
			case 3:		numberOfGames = 3;
						break;
			case 4:		numberOfGames = 6;
						break;
			case 5:		numberOfGames = 10;
						break;
			default:	numberOfGames = 0;
						break;
		}
		return numberOfGames;
	}

}
