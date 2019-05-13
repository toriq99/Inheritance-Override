public class tampilan{
	public static void main(String[]args){
		kartuBimbel kartu=new kartuBimbel("1177","TORIK",11,"IPA","SMA DONG","DI RUMAH","081234567891","XTRA COMBO","2044-2045","LONDON");
		BimbelXtra xtra=new BimbelXtra();
		JamTambahan tbhjam=new JamTambahan();
		HariTambahan tbhhari=new HariTambahan();
		
		System.out.println("+================+");
		System.out.println("+  KARTU BIMBEL  +");
		System.out.println("+================+\n");
		System.out.println("ID\t: "+kartu.id());
		System.out.println("Nama\t: "+kartu.nama());
		System.out.println("Kelas\t: "+kartu.kelas());
		System.out.println("Jurusan\t: "+kartu.jurusan());
		System.out.println("Sekolah\t: "+kartu.sekolah());
		System.out.println("Alamat\t: "+kartu.alamat());
		System.out.println("No.HP\t: "+kartu.noHP());
		System.out.println("Paket\t: "+kartu.paketBimbel());
		System.out.println("Tahun\t: "+kartu.tahunAjar());
		System.out.println("Unit\t: "+kartu.unit());
		System.out.println("=============================");
		
		tbhjam.tambahan=2;
		xtra.waktu();
		tbhjam.waktu();
		tbhhari.tambahan="Senin";
		xtra.hari();
		tbhhari.hari();
	}
}