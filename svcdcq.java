package SINHVIEN;

import java.util.Scanner;

public class svcdcq extends Nguoi {
	private float tdkt;
	private float smkt;
	private float dkthp;
	public svcdcq(String hoten, String ngaysinh, String diachi, int loai, float diem, float tdkt, float smkt,
			float dkthp) {
		super(hoten, ngaysinh, diachi, loai, diem);
		this.tdkt = tdkt;
		this.smkt = smkt;
		this.dkthp = dkthp;
	}
	public void svcdcq()
	{
		
	}
	public double tinhDiem()
	{
		double diem =(tdkt / smkt + dkthp) / 3;
		return diem;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("tdkt : " );
		tdkt = sc.nextFloat();
		System.out.println("smkt : " );
		smkt = sc.nextFloat();
		System.out.println("dkthp : " );
		dkthp = sc.nextFloat();
	}
	public void in()
	{
		super.in();
		System.out.println("diem tk : " + diem());
	}
}
