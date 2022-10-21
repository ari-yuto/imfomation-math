package math;

public class math6 {

	public static void main(String[] args) {
		int run[]= {20, 1, 6, 3, 5, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 1, 5, 1, 3, 1,
				 5, 1, 5, 5, 5, 1, 4, 1, 5, 1, 4, 1, 4, 1, 5, 1, 3, 3, 2 };
		int sum;
		sum=0;
		for(int i=0;i<run.length;i++) {
			for(int j=0;j<run[i];j++) {
				if(sum%16==0) {
					System.out.println();
				}
				if(i==0) {
					System.out.print("□");
				}
				else if(i%2==1) {
					System.out.print("■");
				}
				else if(i%2==0) {
					System.out.print("□");
				}
				sum+=1;
			}
		}
	}

}
