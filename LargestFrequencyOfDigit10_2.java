//largest repeating
class LargestFrequencyOfDigit10_2
{
public static void main(String[] args)
{
long num=12312312314151;
System.out.println(num);
int dgt =0;
int max=0;
for(int i=0;i<=9;i++)
{
int cnt=0;
for(long j=num;j>0;j/=10)
{
long rem=j%10;
if(i==rem)
{
cnt++;
}
}

if(cnt !=0)
{
if(max<cnt)
max=cnt;
dgt =i;
}
}
}System.out.println("max  digit is "+ dgt +"with a fre of"+max);
}
