package math;
import java.util.Scanner;

class math5{
  public static void main(String[] args) {
  //情報量
  double n,total;
  n=2.0;
  total=14.0;
  System.out.println(-Math.log(n/total)/Math.log(2.0));

  //平均情報量
  double h,zenyouso;
  h=0.0;
  zenyouso=0.0;
  Scanner scan=new Scanner(System.in);
  int yousosu=scan.nextInt();
  scan.close();

  double youso[]={60.0,2.0,1.0,1.0};
  
  for(int i=1;i<=yousosu;i++){
     zenyouso=zenyouso+youso[i-1];
    }
  for(int i=1;i<=yousosu;i++){
	  h=h+((-youso[i-1]/zenyouso)*(Math.log(youso[i-1]/zenyouso)/Math.log(2.0)));
  	}
  System.out.println(h);

  }
}
