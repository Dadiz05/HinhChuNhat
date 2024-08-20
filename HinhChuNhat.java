package giaVi_23676951;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi d");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieuRong = r;
		}
		
	}
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		this.chieuDai = d;
		this.chieuRong = r;
		
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi d");
		}
		
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieuRong = r;
		}
	}
	
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	public static void main(String[] args) {
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		System.out.println("Ket qua hinh 1");
		System.out.println("Chieu dai la: " + h1.getChieuDai());
		System.out.println("Chieu rong la: " + h1.getChieuRong());
		System.out.println("Chu Vi la: " + h1.getChuVi());
		System.out.println("Dien Tich la: " + h1.getDienTich());
		
		HinhChuNhat h2= new HinhChuNhat(15, 10);
		System.out.println("Ket qua hinh 2");
		System.out.println("Chieu dai la: " + h2.getChieuDai());
		System.out.println("Chieu rong la: " + h2.getChieuRong());
		System.out.println("Chu Vi la: " + h2.getChuVi());
		System.out.println("Dien Tich la: " + h2.getDienTich());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu ban phim:");
		System.out.println("Nhap chieu dai:");
		double d = sc.nextDouble();
		h1.setChieuDai(d);
		System.out.println("Nhap chieu rong:");
		double r = sc.nextDouble();
		h1.setChieuRong(r);
		System.out.println("Ket qua nhap mem cua hinh 1");
		System.out.println("Chieu dai la: " + h1.getChieuDai());
		System.out.println("Chieu rong la: " + h1.getChieuRong());
		System.out.println("Chu Vi la: " + h1.getChuVi());
		System.out.println("Dien Tich la: " + h1.getDienTich());
	}
}
