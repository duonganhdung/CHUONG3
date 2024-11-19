package SINHVIEN;

import java.util.Scanner;

public class SVCDN extends Nguoi {
	private float tdkt;
	private float smkt;
	public SVCDN(String hoten, String ngaysinh, String diachi, int loai, float diem, float tdkt, float smkt) {
		super(hoten, ngaysinh, diachi, loai, diem);
		this.tdkt = tdkt;
		this.smkt = smkt;
	}
	
	public double tinhDiem()
	{
		double diem = tdkt / smkt ;
		return diem;
	}
	public void nhap()
	{ 
		System.out.println("nhap tdkt : ");
		Scanner sc = new Scanner(System.in);
		tdkt = sc.nextFloat();
		System.out.println("smkt : ");
		smkt = sc.nextFloat();
	}
	public void in()
	{
		System.out.println("diem " + tinhDiem());
	}
}
