import java.io.IOException;
import java.util.Scanner;

public class Forward extends Player{
	private String position = "Forward";
	public int forward_skills = 80;
	public int midfield_skills = 40;
	public int defense_skills = 30;
	public Forward(String name, String n2, int age, int number, String nationality) {
		super(name, n2, age, number, nationality);
		
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
