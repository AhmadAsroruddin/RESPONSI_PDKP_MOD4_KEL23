package com.example;
import java.util.Scanner;

public class enkripsidandekripsi {
    static char[] enkripsi(String kata){
        char[] huruf = {'A','B','C','D','E','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b',
                            'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int panjang = kata.length();
        char[] karakterBefore = new char[panjang];
        char[] hasil = new char[panjang];

        for (int i =0; i<=kata.length()-1; i++){
            karakterBefore[i] = kata.charAt(i);
        }
        for(int  j =0; j<=kata.length()-1;j++){
            for(int x = 0; x<=huruf.length-1;x++){
                if(karakterBefore[j] == 'z'){
                    hasil[j] = 'a';
                }else if(karakterBefore[j] == huruf[x]){
                    hasil[j] = huruf[x+1];
                }
            }
        }
        return hasil;
    }

    public static void main(String[]args){
        dekripsi objek = new dekripsi();
        int c =0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hallo selamat datang di program Enkripsi dan Dekripsi");
        do{
            System.out.println("Apa yang ingin anda lakukan?");
            System.out.println("(1) Enkripsi \n (2) Dekripsi");
            int pilihan = scan.nextInt();

            if(pilihan == 1){
                System.out.println("Masukan kalimat : ");
                String s = scan.nextLine();
                char[] hasil = enkripsi(s);
                for(int i = 0; i<=s.length()-1;i++){
                    System.out.print(hasil[i]);
                }
            } else if(pilihan==2){
                System.out.println("Masukan kalimat : ");
                String s = scan.nextLine();
                char[] hasil = objek.dekripsi(s);
                for(int i = 0; i<=s.length()-1;i++){
                    System.out.print(hasil[i]);
                }
            }

            System.out.println("Apakah ingin melakukan lagi? tulis 0 untuk berhenti 1 untuk lanjut");
            int lanjut = scan.nextInt();

            if(lanjut == 0){
              break;
            }
        }while(c<=5);



    }
}
