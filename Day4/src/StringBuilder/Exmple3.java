package StringBuilder;

public class Exmple3 {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i =0;i<1000;i++) {
			sb.append("Tpoint");
		}
System.out.println("Time Taken by StringBuffer:" + (System.currentTimeMillis()-startTime)+ "ms");
startTime=System.currentTimeMillis();
StringBuilder sb2=new StringBuilder("Java");
for(int i=0;i<1000;i++) {
	sb2.append("Tpoint");
}
System.out.println("Time Taken by StringBuilder:" + (System.currentTimeMillis()-startTime)+"ms");
	}
}
