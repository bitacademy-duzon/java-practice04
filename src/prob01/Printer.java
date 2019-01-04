package prob01;

public class Printer{
//	public void println( int val ) {
//		System.out.println( val );
//	}
//
//	public void println( boolean val ) {
//		System.out.println( val );
//	}
//	
//	public void println( String val ) {
//		System.out.println( val );
//	}
//	
//	public void println( double val ) {
//		System.out.println( val );
//	}
	
//	public <T> void println( T t ) {
//		System.out.println( t );
//	}
	
	// 가변 변수
	public Integer sum(Integer... nums) {
		Integer sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		return sum;
	}
	
	@SuppressWarnings("unchecked")
	public <T> void println( T... ts ) {
		for(T t : ts) {
			System.out.println( t );
		}
	}
	
}
