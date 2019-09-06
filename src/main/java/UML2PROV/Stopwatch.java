package UML2PROV;

public class Stopwatch {
	private final long start;
	private long elapseTime; 

	public Stopwatch() {
		start = System.nanoTime();
		elapseTime=0;
	}

	public long elapsedTime() {
		return  System.nanoTime() - start;
	}
	
	public long getElapseTime(){
		return elapseTime;
	} 
	
}