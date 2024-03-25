package B1;
import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {
	      
	        HinhChuNhat hcn = new HinhChuNhat();
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("nhập vào chiều dài : ");
	        hcn.setDai(scanner.nextDouble());
	        System.out.println("nhập vào chiều rộng : ");
	        hcn.setRong(scanner.nextDouble());
	      
	        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
	        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
	        System.out.println("----------------------end----------------------------");
	        System.out.println("Chương trình này được đăng tại Freetuts.net");
	    }
	}
