import java.util.*;

public class Team {
	public String name;
	public int num_players;
	public ArrayList<Player> team = new ArrayList<Player>();
	public Team(){	
	}
	public Team(String s){
		name = s;
	}
	public void addPlayer(Player p){
		team.add(p);
	}
	public void set_num_players(int x){
		num_players = x;
	}
	public void set_team_name(String s){
		name = s;
	}
	public String get_team_name(){
		return name;
	}
	public void analyze_team(){
		int f = 0;
		int m = 0;
		int d = 0;
		for (Player p: team){
			f += p.get_forward_skills();
			m += p.get_midfield_skills();
			d += p.get_defense_skills();
		}
		if (f > m && f >d){
			System.out.println("Your team is offense oriented");
		}
		else if (m>f && m>d){
			System.out.println("Your team is midfield oriented");
		}
		else if (d>f && d>m){
			System.out.println("Your team is defense oriented");
		}
		else {
			System.out.println("Your team is balanced");
		}
	}
	
}
