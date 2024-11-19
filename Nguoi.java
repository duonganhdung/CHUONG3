package SINHVIEN;

import java.util.Scanner;

public abstract class  Nguoi {
	 private String hoten;
	 private String ngaysinh;
	 private String diachi;
	 private int loai ;
	 private float diem;
	public Nguoi(String hoten, String ngaysinh, String diachi, int loai, float diem) {
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.loai = loai;
		this.diem = diem;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten : ");
		hoten = sc.nextLine();
		System.out.println("nhap ngay sinh : ");
		ngaysinh = sc.nextLine();
		System.out.println("dia chi : ");
		diachi = sc.nextLine();
		System.out.println("loai : ");
		loai = sc.nextInt();
		System.out.println("diem : " );
		diem = sc.nextFloat();
	}
	public void Nguoi()

	{	
	}
	 public abstract double tinhDiem();
	 

	
	@Override
	public String toString() {
		return "Nguoi [hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", loai=" + loai + ", diem="
				+ diem + "]";
	}
	public void in()
	 {
		 System.out.println("ho ten " + hoten);
		 System.out.println("dia chi " + diachi );
		 System.out.println("ngay sinh " + ngaysinh);
		 System.out.println("loai " + ((loai == 1 )?"sinh vien chinh quy " : "sinh vien cao dang "));	 
	 }
}
