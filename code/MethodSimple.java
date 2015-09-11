public class MethodSimple{
	
	public static void main(String[] args){
		int a = tambah(4, 5);
		cetak("Hasil hitung: " + a);
	}

	public static void cetak(String pesan){
		System.out.println(pesan);
	}

	public static int tambah(int a, int b){
		return a + b;
	}
}