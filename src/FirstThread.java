
public class FirstThread extends Thread{
    FirstThread(){
    	System.out.println("my thread created:"+this);
    	start();
    }
    public void run(){
    	try{
    		for(int i=0;i<10;i++){
    			System.out.println("printing the count"+i);
    			Thread.sleep(1000);
    		}
    	}
    	catch(InterruptedException e){
    		System.out.println("my thread interrupted");
    	}
    	System.out.println("my thread run is overr");
    }
}
