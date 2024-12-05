 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        /* Pekerjaan anda mulai dari sini */
        int HitungGaji;
        int HitungLembur;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan masa kerja:");
        masaKerja = input.nextInt();
        System.out.println("Masukkan jam lembur:");
        int jamLembur = input.nextInt();

        HitungGaji = hitungGaji();

        HitungLembur = hitungLembur(jamLembur);

        int totalGaji = HitungGaji + HitungLembur;
        System.out.println("Total Gaji :"+ totalGaji);
    }

        /* Pekerjaan anda mulai dari sini */
    public static int hitungGaji(){
        int gajiPokok;
            if (masaKerja < 5){
                gajiPokok = 5000000;
            }
            else if (masaKerja >= 5 && masaKerja <= 10) {
                gajiPokok = 7500000;
                
            }
            else{
                gajiPokok = 10000000;
            }
            return  gajiPokok;
        } 

    public static int hitungLembur(int jamLembur){
        int Uanglembur;
            if (masaKerja < 5){
                Uanglembur = jamLembur * 40000;
            }
            else if (masaKerja >= 5 && masaKerja <= 10) {
                Uanglembur = jamLembur * 50000;
                
            }
            else{
                Uanglembur = jamLembur * 75000;
            }
            return Uanglembur;
        } 


        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
