import java.util.Scanner;

public class NhapNgu {

    public static void main(String[] args) {
        int tuoi;

        Scanner ip= new Scanner(System.in);

        System.out.println("Nhap tuoi cua ban:" );
        tuoi = ip.nextInt();

        if(tuoi >= 18 && tuoi <= 27){
            System.out.println("nhập ngũ");
        }
        else if(tuoi < 18) {
            System.out.println("Chua den tuoi nhap ngu");
        }
        else {
            System.out.println("Qua tuoi nhap ngu");
        }
    }

}
