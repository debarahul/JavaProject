package testproject;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n1=0,n2=1,n3,i,count=20;
      System.out.print(n1+" "+n2);//print 0 and 1  
      
      for(i=2;i<count;++i) //loop start from 2
      {
    	 n3=n1+n2; 
    	 System.out.print(" "+n3);
    	 n1=n2;
    	 n2=n3;
      }
	}

}

//print(): print() method in Java is used to display a text on the console. This text is passed as the parameter to this method in the form of String. This method prints the text on the console and the cursor remains at the end of the text at the console. The next printing takes place from just here.
//print() --> method only and only works with argument, otherwise it is an syntax error.
//println(): println() method in Java is also used to display a text on the console. This text is passed as the parameter to this method in the form of String. This method prints the text on the console and the cursor remains at the start of the next line at the console. The next printing takes place from next line.
