
public class Player {
	private int id;
	private String name;
	private int icc_rank;
	private int matches_played;
	private int runs_scored;
	
	public Player(int id,String name,int icc_rank,int matches_played,int runs_scored) {
		this.id=id;
		this.name=name;
		this.icc_rank=icc_rank;
		this.matches_played=matches_played;
		this.runs_scored=runs_scored;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setIcc_rank(int icc_rank) {
		this.icc_rank = icc_rank;
	}
	public int getIcc_rank() {
		return icc_rank;
	}
	
	public void setMatches_played(int matches_played) {
		this.matches_played = matches_played;
	}
	public int getMatches_played() {
		return matches_played;
	}
	
	public void setRuns_scored(int runs_scored) {
		this.runs_scored = runs_scored;
	}
	public int getRuns_scored() {
		return runs_scored;
	}	
	
}
