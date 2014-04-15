/**
 * 
 */
package nl.kotterlink.jsc;

/**
 * @author tim
 *
 */
public class JacStammesCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Poule poulePAGD = new Poule("PAGD");
		Poule poulePBGD = new Poule("PBGD");
		Poule poulePCGD = new Poule("PCGD");

		//PBGD stands for poule A Gemengd D.
		poulePAGD.addTeam(new Team("FIQAS Aalsmeer JD"));
		poulePAGD.addTeam(new Team("Quintus"));
		poulePAGD.addTeam(new Team("Houten"));
//		poulePAGD.addTeam(new Team("Gemini"));
		
		//PBGD stands for poule B Gemengd D.
		poulePBGD.addTeam(new Team("FIQAS Aalsmeer MD"));
		poulePBGD.addTeam(new Team("E en O"));
		poulePBGD.addTeam(new Team("Kras Volendam D3"));
		poulePBGD.addTeam(new Team("Internos"));

		//PCGD stands for poule C Gemengd D.
		poulePCGD.addTeam(new Team("Handbalschool Brabant"));
		poulePCGD.addTeam(new Team("Klink-Nijland Kwiek"));
		poulePCGD.addTeam(new Team("Kras Volendam D1"));
		poulePCGD.addTeam(new Team("Succes VOC Amsterdam"));
		poulePCGD.addTeam(new Team("BlaDieBla"));
		
		poulePAGD.printPoule();
		poulePBGD.printPoule();
		poulePCGD.printPoule();

		poulePAGD.numberOfGames();
		poulePBGD.numberOfGames();
		poulePCGD.numberOfGames();

	}
}
