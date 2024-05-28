import java.util.LinkedList;

public class Threadexample {
	public static void main(String[] args)
		throws InterruptedException
	{
		final PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static class PC {

		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		public void produce() throws InterruptedException
		{
			int value = 0;
			while (true) {
				synchronized (this)
				{
					while (list.size() == capacity)
						wait();

					System.out.println("Producer produced-"
									+ value);

					list.add(value++);

					notify();

					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					while (list.size() == 0)
						wait();

					int val = list.removeFirst();

					System.out.println("Consumer consumed-"
									+ val);

					notify();

					Thread.sleep(1000);
				}
			}
		}
	}
}

/*Output
Producer produced-0
Producer produced-1
Consumer consumed-0
Consumer consumed-1
Producer produced-2
Producer produced-3
Consumer consumed-2
Consumer consumed-3
Producer produced-4
Producer produced-5
Consumer consumed-4
Consumer consumed-5
Producer produced-6
Producer produced-7
Consumer consumed-6
Consumer consumed-7
Producer produced-8
Producer produced-9
Consumer consumed-8
Consumer consumed-9
Producer produced-10
Producer produced-11
Consumer consumed-10
Consumer consumed-11
Producer produced-12
Producer produced-13
Consumer consumed-12
Consumer consumed-13
Producer produced-14
Producer produced-15
Consumer consumed-14
Consumer consumed-15
Producer produced-16
Producer produced-17
Consumer consumed-16
Consumer consumed-17
Producer produced-18
Producer produced-19
Consumer consumed-18
Consumer consumed-19
Producer produced-20
Producer produced-21
Consumer consumed-20
 */