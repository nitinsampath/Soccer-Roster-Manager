
public class Defender extends Player{
	private String position = "Defender";
	public int forward_skills = 20;
	public int midfield_skills = 40;
	public int defense_skills = 90;
	public Defender(String n, String n2, int ager, int numer, String nat) {
		super(n, n2, ager, numer, nat);
		
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
