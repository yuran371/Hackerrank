package dataStructures;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Checker implements Comparator<Player> {
	@Override
	public int compare(Player p1, Player p2) {
		if (p1.score==p2.score) {
			return p1.name.compareTo(p2.name);
		} else if (p1.score>p2.score) {
			return -1;
		} else {
			return 1;
		}
	}
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class ComparatorTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        ArraysTask.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
