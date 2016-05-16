
public class ThreadCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThread fst=new FirstThread();
try{
	while(fst.isAlive()){
		System.out.println("main thread will be alive till the child thread is live");
		Thread.sleep(6000);
	}
}catch(InterruptedException e){
	System.out.println("main thread is interrupted");
}
System.out.println("main tthread is over");
	}

}
