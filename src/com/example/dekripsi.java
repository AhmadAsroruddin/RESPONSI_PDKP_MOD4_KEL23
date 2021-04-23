package com.example;

public class dekripsi {
    public char[] dekripsi(String kata){
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
                if(karakterBefore[j] == 'A'){
                    hasil[j] = 'Z';
                }else if(karakterBefore[j] == huruf[x]){
                    hasil[j] = huruf[x-1];
                }
            }
        }
        return hasil;
    }
}
