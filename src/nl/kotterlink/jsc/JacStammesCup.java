/**
 * 
 */
package nl.kotterlink.jsc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tim
 *
 */
public class JacStammesCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Creating the ArrayList for the object team.
		List<Team> listPAGD = new ArrayList<Team>();

		//PAGD stands for Poule A Gemengd D.
		Team teamPAGD1 = new Team("FIQAS Aalsmeer JD");
		Team teamPAGD2 = new Team("Quintus");
		Team teamPAGD3 = new Team("Houten");
		Team teamPAGD4 = new Team("Gemini");

		//Adding the teams to the listPAGD.
		listPAGD.add(teamPAGD1);
		listPAGD.add(teamPAGD2);
		listPAGD.add(teamPAGD3);
		listPAGD.add(teamPAGD4);

		//show the listPAGD items in the console output.
		for (Team team : listPAGD) {
			System.out.println(team);
		}

	}
}
