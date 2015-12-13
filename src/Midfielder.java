
public class Midfielder extends Player {
	private String position = "Midfielder";
	public int forward_skills = 20;
	public int midfield_skills = 80;
	public int defense_skills = 50;
	public Midfielder(String n, String n2, int ager, int numer, String nat) {
		super(n, n2, ager, numer, nat);
		// TODO Auto-generated constructor stub
	}
	public String get_position(){
		return position;
	}
	public int get_forward_skills(){
		return forward_skills;
	}
	public int get_midfield_skills(){
		return midfield_skills;
	}
	public int get_defense_skills(){
		return defense_skills;
	}
}
