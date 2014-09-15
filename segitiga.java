import java.util.*;
class segitiga {
	public static void main(String[]args){
		Scanner sc =  new Scanner(System.in);
		int a,l,t;
		int hasil;
		System.out.println("Alas :");
		a = sc.nextInt();
		System.out.println("Lebar  :");
		l = sc.nextInt();
		System.out.println("Tinggi :");
		t = sc.nextInt();
		hasil = a*l*t;
		System.out.println("Luas persegi  :" +hasil);
	}
}