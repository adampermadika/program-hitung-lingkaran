class ObjLingkaran {
	
// main method ? Java application
	public static void main(String[] args) {
		
		ProLingkaran bulat1 = new ProLingkaran();
		System.out.print("Masukkan Jari-jari lingkaran ke 1:");
		String strRadius= System.console().readLine(); 	
		bulat1.radius = Double.parseDouble(strRadius);
		System.out.println("Keliling : " + bulat1.HitungLuas() );
		System.out.println("Luas :" + bulat1.HitungKeliling() );
		System.out.println("\n" );
		
		ProLingkaran bulat2 = new ProLingkaran();
		System.out.print("Masukkan Jari-jari lingkaran ke 2:");
		String strRadius2= System.console().readLine(); 	
		bulat2.radius = Double.parseDouble(strRadius2);
		System.out.println("Keliling : " + bulat2.HitungLuas() );
		System.out.println("Luas :" + bulat2.HitungKeliling() );
}}