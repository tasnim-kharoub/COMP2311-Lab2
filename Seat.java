
public class Seat {
	private int seatNumber;
	private String passengerName;

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isEmpty() {
		return this.passengerName == null;
	}

	public String toString() {
		return this.seatNumber + "," + this.passengerName;
	}

	static boolean isValid(int seatNumber) {
		if (seatNumber < 1 && seatNumber > 92)
			return false;
		return true;
	}

	static int setRow(int seatNumber) {
		if (isValid(seatNumber))
			return (seatNumber / 4);
		else
			return 0;
	}

	static int getColumn(int seatNumber) {
		if (isValid(seatNumber))
			return (seatNumber % 4);
		else
			return 0;

	}
}
