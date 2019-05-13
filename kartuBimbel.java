public class kartuBimbel{
	private String id;
	private String nama;
	private int kelas;
	private String jurusan;
	private String sekolah;
	private String alamat;
	private String noHP;
	private String paketBimbel;
	private String tahunAjar;
	private String unit;
	
	public kartuBimbel(String id, String nama, int kelas, String jurusan, String sekolah, String alamat, String noHP, String paketBimbel, String tahunAjar, String unit){
		this.id=id;
		this.nama=nama;
		this.kelas=kelas;
		this.jurusan=jurusan;
		this.sekolah=sekolah;
		this.alamat=alamat;
		this.noHP=noHP;
		this.paketBimbel=paketBimbel;
		this.tahunAjar=tahunAjar;
		this.unit=unit;
	}
	
	public String id(){
		return id;
	}
	
	public String nama(){
		return nama;
	}
	
	public int kelas(){
		return kelas;
	}
	
	public String jurusan(){
		return jurusan;
	}
	
	public String sekolah(){
		return sekolah;
	}
	
	public String alamat(){
		return alamat;
	}
	
	public String noHP(){
		return noHP;
	}
	
	public String paketBimbel(){
		return paketBimbel;
	}
	
	public String tahunAjar(){
		return tahunAjar;
	}
	
	public String unit(){
		return unit;
	}
}