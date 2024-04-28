import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

            Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat <5) {
            System.out.println("Kayak yapabilirsiniz.");

        } if (heat >= 5 && heat<15){
            System.out.println("Sinema 'ya gidebilirsiniz.'");

        } if (heat >=15 && heat<25) {
            System.out.println("Piknik yapabilirsiniz.");

        }else if(heat >=25){
                System.out.println("Yüzmeye gidebilirsiniz.");

            }

        }


    }
