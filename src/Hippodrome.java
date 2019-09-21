import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
	private List<Horse> horses;
	public static Hippodrome game;

	public Hippodrome(List<Horse> horses) {
		this.horses = horses;
	}

	public List<Horse> getHorses() {
		return horses;
	}

	public void run() throws InterruptedException {
		for(int i = 1; i <= 100; i++){
			move();
			print();
			Thread.sleep(200);
		}
	}

	public void move(){
		for(Horse horse : horses)
			horse.move();
	}

	public void print(){
		for(Horse horse : horses)
			horse.print();
		for(int i = 0; i < 10; i++)
			System.out.println();
	}

	public Horse getWinner(){
		double max = 0;
		Horse ans = null;
		for(Horse horse : horses){
			if (horse.getDistance() > max){
				max = horse.getDistance();
				ans = horse;
			}
		}
		return ans;
	}

	public void printWinner(){
		System.out.printf("Winner is %s!", getWinner().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		Horse horse1 = new Horse("\uD83D\uDC0E", 3, 0);
		Horse horse2 = new Horse("\ud83d\ude00", 3, 0);
		Horse horse3 = new Horse("\ud83d\ude3b", 3, 0);
		List<Horse> horses = new ArrayList<Horse>(3);
		horses.add(horse1);
		horses.add(horse2);
		horses.add(horse3);
		Hippodrome hippodrome = new Hippodrome(horses);
		game = hippodrome;
		game.run();
		hippodrome.printWinner();
	}
}
