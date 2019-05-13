public class JamTambahan extends BimbelXtra{
	int tambahan;
	
	@Override
	int waktu(){
		int jam=tambahan;
		System.out.println("Tambahan Waktu : "+jam);
		return jam;
	}
}