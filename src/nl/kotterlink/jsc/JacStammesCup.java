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

		Pool poolPAGD = new Pool("PAGD");
		Pool poolPBGD = new Pool("PBGD");
		Pool poolPCGD = new Pool("PCGD");

		//PBGD stands for Pool A Gemengd D.
		poolPAGD.addTeam(new Team("FIQAS Aalsmeer JD"));
		poolPAGD.addTeam(new Team("Quintus"));
		poolPAGD.addTeam(new Team("Houten"));
		poolPAGD.addTeam(new Team("Gemini"));
		
		//PBGD stands for Pool B Gemengd D.
		poolPBGD.addTeam(new Team("FIQAS Aalsmeer MD"));
		poolPBGD.addTeam(new Team("E en O"));
		poolPBGD.addTeam(new Team("Kras Volendam D3"));
		poolPBGD.addTeam(new Team("Internos"));

		//PCGD stands for Pool C Gemengd D.
		poolPCGD.addTeam(new Team("Handbalschool Brabant"));
		poolPCGD.addTeam(new Team("Klink-Nijland Kwiek"));
		poolPCGD.addTeam(new Team("Kras Volendam D1"));
		poolPCGD.addTeam(new Team("Succes VOC Amsterdam"));
		
		poolPAGD.printPool();
		poolPBGD.printPool();
		poolPCGD.printPool();
		
	}
}
