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
		int iteration = 0;
		String game1 = "";
		String game2 = "";
		String game3 = "";
		String game4 = "";
		String game5 = "";
		String game6 = "";
		String game7 = "";
		String game8 = "";
		String game9 = "";
		String game10 = "";
		switch (numberOfTeams) {
			//total number of games is 1
			case 2:		game1 = poule.get(0).getTeam() + " - " + poule.get(1).getTeam();
						iteration = 1;
						break;
						//total number of games is 3
			case 3:		game1 = poule.get(0).getTeam() + " - " + poule.get(1).getTeam();
						game2 = poule.get(0).getTeam() + " - " + poule.get(2).getTeam();
						game3 = poule.get(1).getTeam() + " - " + poule.get(2).getTeam();
						iteration = 3;
						break;
						//total number of games is 6
			case 4:		game1 = poule.get(0).getTeam() + " - " + poule.get(1).getTeam();
						game2 = poule.get(2).getTeam() + " - " + poule.get(3).getTeam();
						game3 = poule.get(0).getTeam() + " - " + poule.get(2).getTeam();
						game4 = poule.get(1).getTeam() + " - " + poule.get(3).getTeam();
						game5 = poule.get(0).getTeam() + " - " + poule.get(3).getTeam();
						game6 = poule.get(1).getTeam() + " - " + poule.get(2).getTeam();
						iteration = 6;
						break;
						//total number of games is 10
			case 5:		game1 = poule.get(0).getTeam() + " - " + poule.get(1).getTeam();
						game2 = poule.get(0).getTeam() + " - " + poule.get(2).getTeam();
						game3 = poule.get(0).getTeam() + " - " + poule.get(3).getTeam();
						game4 = poule.get(0).getTeam() + " - " + poule.get(4).getTeam();
						game5 = poule.get(1).getTeam() + " - " + poule.get(2).getTeam();
						game6 = poule.get(1).getTeam() + " - " + poule.get(3).getTeam();
						game7 = poule.get(1).getTeam() + " - " + poule.get(4).getTeam();
						game8 = poule.get(2).getTeam() + " - " + poule.get(3).getTeam();
						game9 = poule.get(2).getTeam() + " - " + poule.get(4).getTeam();
						game10 = poule.get(3).getTeam() + " - " + poule.get(4).getTeam();
						iteration = 10;
						break;
						//total number of games is 0
			default:	
						break;
		}
	
//		for (int i = 0; i < iteration; i++) {
//			System.out.println(game + i);
//		}

		System.out.println("This is poule: " + Poule.this.getPouleName());
		System.out.println("------------------------------------------------------------------------");
		System.out.println(game1 + "\n"
							+ game2 + "\n"
							+ game3 + "\n"
							+ game4 + "\n"
							+ game5 + "\n"
							+ game6 + "\n"
							+ game7 + "\n"
							+ game8 + "\n"
							+ game9 + "\n"
							+ game10 + "\n"
				);
	}
}
