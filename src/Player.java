import java.io.*;
import java.util.Scanner;

public class Player {
	private String name1;
	private String name2;
	private int age;
	private int number;
	private String nationality;
	private String position = "No Position";
	public int forward_skills = 50; //skill level in a category ranges from 1-100; a default player is 50 in all categories
	public int midfield_skills = 50;
	public int defense_skills = 50;
	
	
	
	public Player(String n, String n2, int ager, int numer, String nat) {
		name1 = n;
		name2 = n2;
		age = ager;
		number = numer;
		nationality = nat;
	}
	
	public String get_name1(){
		return name1;
	}
	public String get_name2(){
		return name2;
	}
	public void set_age(int n){
		age = n;
	}
	public int get_age(){
		return age;
	}
	public void set_number(int n){
		number = n;
	}
	public int get_number(){
		return number;
	}
	public String get_nationality(){
		return nationality;
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
