package test;

public class doubleNumber {
	public static void main(String[] args) {
		doubleNum(1200);
//		toBinary(10, new StringBuffer());
//		System.out.println(gcd(6,4));
//		System.out.println(12%-2.0);
//		System.out.println(-12%2.0);
//		System.out.println(12/0.0);
	//	System.out.println(12/0);
		//正无穷
//		System.out.println(Double.POSITIVE_INFINITY);
//		//负无穷
//		System.out.println(Double.NEGATIVE_INFINITY);
//		A.abc(A.xyz());
	}
		public static void toBinary(int n,StringBuffer result){
			if(n/2 != 0)
				toBinary(n/2,result);
			result.append(n%2);	
			System.out.println(result);
		}
	
	private static void doubleNum(int n) {
		System.out.println(n+","+n);
		if(n<=5000){
			doubleNum(n*2);
			System.out.println(n+",");
		}
	}
	
		//求最大公约数
	public static int gcd(int p,int q){
		if(q == 0) return p;
		int r = p % q;
		return gcd(q,r);
	}
	static class A{
	    public static  void abc(Object i){
	        System.out.println(i);
			
	    }
	    public static  Integer xyz(){
	        System.out.println("ddd");
			return 0;
	       
	    }
	}
}
