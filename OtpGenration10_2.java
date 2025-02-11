//otp genration
class OtpGenration10_2
{
public static void main(String[] args)
{
String Otp="";
for(int cnt=1;cnt<=10;)
{
Otp=Otp+(int)(Math.random()*1000000);

if(Otp.length()==6)
{
System.out.println(cnt+" "+Otp);
cnt++;
}
Otp=" ";

}
}
}
