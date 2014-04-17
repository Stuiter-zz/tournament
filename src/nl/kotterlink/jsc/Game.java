/**
 * 
 */
package nl.kotterlink.jsc;

/**
 * @author tim
 *
 */
public class Game {
	
	private Team team1;
	private Team team2;

	public Game(Team homeTeam, Team outTeam) {
		this.team1 = homeTeam;
		this.team2 = outTeam;
	}

	public void printGame() {
		System.out.println(team1.getTeam() + " - " + team2.getTeam());
	}
}
