/**
 * 
 */
package nl.kotterlink.jsc;

/**
 * @author tim
 *
 */
public class Team {

	private String team;
	private int gamesPlayed;
	private int gamesWon;
	private int gamesEqual;
	private int gamesLost;
	private int goalsFor;
	private int goalsAgainst;

	/**
	 * @param team
	 */
	public Team(String team) {
		super();
		this.team = team;
	}

	/**
	 * @param team
	 * @param gamesPlayed
	 * @param gamesWon
	 * @param gamesEqual
	 * @param gamesLost
	 * @param goalsFor
	 * @param goalsAgainst
	 */
	public Team(String team, int gamesPlayed, int gamesWon, int gamesEqual,
			int gamesLost, int goalsFor, int goalsAgainst) {
		super();
		this.team = team;
		this.gamesPlayed = gamesPlayed;
		this.gamesWon = gamesWon;
		this.gamesEqual = gamesEqual;
		this.gamesLost = gamesLost;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return the gamesPlayed
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * @param gamesPlayed the gamesPlayed to set
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	/**
	 * @return the gamesWon
	 */
	public int getGamesWon() {
		return gamesWon;
	}

	/**
	 * @param gamesWon the gamesWon to set
	 */
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	/**
	 * @return the gamesEqual
	 */
	public int getGamesEqual() {
		return gamesEqual;
	}

	/**
	 * @param gamesEqual the gamesEqual to set
	 */
	public void setGamesEqual(int gamesEqual) {
		this.gamesEqual = gamesEqual;
	}

	/**
	 * @return the gamesLost
	 */
	public int getGamesLost() {
		return gamesLost;
	}

	/**
	 * @param gamesLost the gamesLost to set
	 */
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}

	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * @param goalsFor the goalsFor to set
	 */
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

}
