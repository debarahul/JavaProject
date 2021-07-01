package javaprogram;

public class number_seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=1;i<50;i++)
		{
			if (i>20)
			{
				break;
			}
			else if(i%2==0)
			{
				continue;
			}
			else
				System.out.println(i);

	}

}
}