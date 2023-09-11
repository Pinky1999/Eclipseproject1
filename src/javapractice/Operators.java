package javapractice;

public class Operators {

	public static void main(String[] args) {
		
		int a=22,b=16;
		System.out.println("value of a+b="+(a+b));
		int c=45,d=13;
		System.out.println("value of c-d="+(c-d));		
		System.out.println("value of a/b="+(a/b));
		System.out.println("value of a*b="+(a*b));
		System.out.println("value of a%b="+(a%b));
		
		int e=45,f=33;
		//System.out.println(e=+f);
		System.out.println(e+=f);
		System.out.println(e-=f); 
		System.out.println(e/=f);
		System.out.println(e*=f);
		
		int g=32,h=66;
		System.out.println(g<h);
		System.out.println(g>h);
		System.out.println(g>=h);
		int i=65,j=34;
		boolean k=i>j;
		System.out.println(k);
		System.out.println(i==5);
		System.out.println();
		
		String man="jake";
		String woman="amy";
		System.out.println(man=="jake" && woman=="amy");
		System.out.println(man=="jake" || woman=="amy");
		System.out.println(!(man=="jake"));
		System.out.println(!(man=="jake"));
		
		int v=8;
		System.out.println(v++);
		System.out.println(v--);
		System.out.println(v);
		System.out.println(--v);
		System.out.println(++v);
		
		int m=90,r=60;
		int t=m>r?m:r;
		System.out.println(t);
		int q=20,o=50;
		int s=q<o?o:q;
		System.out.println(s);
		
		
		
	}

}
