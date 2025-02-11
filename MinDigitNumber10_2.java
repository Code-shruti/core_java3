class MinMaxDigitNumber10_2
{
	public static void main(String[] args)
	{
		int num=59857363;
		int min=9;
		int max=0;
		for(int i=num;i > 0;i/=10)
		{
			int dgt=i % 10;
			if(min>dgt)
			{
				min=dgt;
			}
			
			else if(max<dgt)
			{
				max=dgt;
			}
		}
				
			System.out.println(min);
			System.out.println(max);
			
			
				
	}
}