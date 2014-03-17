package nl.kotterlink.jsc;

import java.util.ArrayList;
import java.util.List;

public class Pool {

	private String poolName;
	private List<Team> pool = new ArrayList<Team>();

	public Pool(String poolName) {
		this.poolName = poolName;
	}

	public void addTeam(Team team) {
		this.pool.add(team);
	}

	public String getPoolName() {
		return poolName;
	}

	@Override
	public String toString() {
		return "Pool [poolName=" + poolName + ", pool=" + pool + "]";
	}
	
	public void printPool() {
		System.out.println("Pool Name: " + poolName);
		for (Team team : pool) {
			System.out.println(team);
		}
		System.out.println();
	}

}
