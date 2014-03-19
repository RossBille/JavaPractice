package interview.questions.threads;

/**
 *
 * @author rossbille
 */
public class Deadlock
{
	private static String str1 = "string1";
	private static String str2 = "string2";
	
	public static void main(String[] args){
		Thread thread1 = new Thread("thread1"){

			@Override
			public void run()
			{
				while(true){
					synchronized(str1){
						synchronized(str2){
							System.out.println(str1);
						}
					}
				}
			}
		};
		Thread thread2 = new Thread("thread2"){

			@Override
			public void run()
			{
				while(true){
					synchronized(str2){
						synchronized(str1){
							System.out.println(str2);
						}
					}
				}
			}	
		};
				
		System.out.println("Starting");
		thread1.start();
		thread2.start();
	}
}
