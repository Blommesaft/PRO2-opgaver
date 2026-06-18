package opgave3Teater;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		theater.printTheaterFloor();

		theater.buySeat(50);
		theater.buySeat(1,1);

		theater.printTheaterFloor();
	}
}
