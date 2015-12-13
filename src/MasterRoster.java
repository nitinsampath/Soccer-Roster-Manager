import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class MasterRoster { //roster can have multiple teams, teams can have multiple players

	public ArrayList<Team> master = new ArrayList<Team>(); 
	public MasterRoster(){
		
	}
	public static Player createPlayer() throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter player first name");
		while (!scan.hasNext("[A-Za-z]+")) {
	        System.out.println("Only letters please");
	        scan.next();
	    }
		String n1 = scan.next();
		System.out.println("Please enter player last name");
		while (!scan.hasNext("[A-Za-z]+")) {
	        System.out.println("Only letters please");
	        scan.next();
	    }
		String n2 = scan.next();
		System.out.print("Please enter player age");
		while(!scan.hasNextInt()) {
		    scan.next();
		    System.out.println("Integers only please");
		}
		int ager = scan.nextInt();
		System.out.print("Please enter player jersey number");
		while(!scan.hasNextInt()) {
		    scan.next();
		    System.out.println("Integers only please");
		}
		int numer = scan.nextInt();
		System.out.println("Please enter player nationality");
		while (!scan.hasNext("[A-Za-z]+")) {
	        System.out.println("Only letters please");
	        scan.next();
	    }
		String nat = scan.next();
		System.out.println("Pick your player's position: Enter f for forward, m for midfielder, or d for defender");
		char lol = scan.next().charAt(0);
		/*
		switch (lol){
		case 'f':
			Forward x = new Forward(n1,n2,ager,numer,nat);
			return x;
		case 'm':
			Midfielder m = new Midfielder(n1,n2,ager,numer,nat);
			return m;
		case 'd':
			Defender d = new Defender(n1,n2,ager,numer,nat);
			return d;
		
		}
		*/
		if (scan.next().charAt(0) == 'f'){
				Forward x = new Forward(n1,n2,ager,numer,nat);
				return x;
			}
			
			else if (scan.next().charAt(0) == 'm'){
				Midfielder m = new Midfielder(n1,n2,ager,numer,nat);
				return m;
			}
			else if (scan.next().charAt(0) == 'd'){
				Defender d = new Defender(n1,n2,ager,numer,nat);
				return d;
			}
			else{
				System.out.println("Looks like you want the default player");
				Player x = new Player(n1,n2, ager, numer, nat);
				return x;
			}
		
		
			
		
	}
	public void add_team(Team t){
		master.add(t);
	}
	
	public void summarizeRoster(Manager m){
		
		for (Team t : master){
			System.out.println("Team: " + t.get_team_name());
			String format = "|%1$-30s|%2$-10s|%3$-20s|%4$-20s|\n";
			System.out.format(format, "Name", "Age", "Nationality","Position");
			m.textarea.append(t.get_team_name());
			m.textarea.append("\n");
			for (Player p: t.team){
				String format1 = "|%1$-30s|%2$-10s|%3$-20s|%4$-20s|\n";
				String namer = p.get_name1() + " " + p.get_name2();
			    System.out.format(format1, namer, p.get_age(), p.get_nationality(), p.get_position());
			    String s = (p.get_name1() + " " + p.get_name2() + " " + p.get_age() + " " + p.get_nationality() + " " + p.get_position());
			    m.textarea.append(s);
			    m.textarea.append("\n");
			   
		}
			
		}
	}
	
	public static void main(String[] args) throws InputMismatchException, IOException{
		
			Manager m = new Manager();
			
			
		MasterRoster mr = new MasterRoster();
		
		System.out.println("Welcome to the Soccer Roster Manager TM!");
		Scanner scan = new Scanner(System.in);
		System.out.println("How many teams do you want on this roster?");
		int num_teams = scan.nextInt();
		for (int x = 0; x < num_teams; x++){
			System.out.println("Please enter team name");
			while (!scan.hasNext("[A-Za-z]+")) {
		        System.out.println("Only letters please");
		        scan.next();
		    }
			String n = scan.next();
			Team t = new Team(n);
			System.out.println("Please enter number of players");
			if(scan.hasNext()){
				int number_of_p = scan.nextInt();
			
			for (int i = 0; i < number_of_p; i++){
				Player creation = createPlayer();
				t.team.add(creation);
			}
			}
			mr.master.add(t);
			t.analyze_team();
			System.out.println("");
		}
		
		System.out.println("Let's take a look at our roster!");
		System.out.println("Check the popup window if you would like to make any changes");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		m.setVisible(true);
		mr.summarizeRoster(m);
		
	}
	}

