class MaxDigitNumber10_2
{
public static void main(String[] args)
	{
	int num=59857363;
	int max=0;
	for(int i=num;i>0;i/=10)
		{
		int dgt=i%10;
		if(max<dgt)
			max = dgt;
		}
		System.out.println("Lagest Digit from"+num+ " is " +max);
		
	}
}
	