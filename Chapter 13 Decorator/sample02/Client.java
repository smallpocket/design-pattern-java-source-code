public class Client
{
	public static void main(String args[])
	{
		String password="sunnyLiu";  //明文
		String cpassword;       //密文

		// 透明装饰模式
		Cipher sc,ac,cc;
		
		sc=new SimpleCipher();
		cpassword=sc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("---------------------");
		
		cc=new ComplexCipher(sc);
		cpassword=cc.encrypt(password);
	    System.out.println(cpassword);
		System.out.println("---------------------");
		
		ac=new AdvancedCipher(cc);
		cpassword=ac.encrypt(password);
	    System.out.println(cpassword);
		System.out.println("---------------------");
	}
}
