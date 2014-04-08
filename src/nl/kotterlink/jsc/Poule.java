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

}
