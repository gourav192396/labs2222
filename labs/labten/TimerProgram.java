package labten;

public class TimerProgram implements Runnable {

	private int counter = 0;

	@Override
	public void run() {
		while (true) { // run infinitely
			try {
				Thread.sleep(1000); // sleep it 1 second for reset
				if (counter < 10) {
					counter++;
					// print current time
					System.out.println("Time is " + counter);
				} else {
					counter = 0;
					System.out.println("Timer Reset");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runnable runnable = new TimerProgram();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
