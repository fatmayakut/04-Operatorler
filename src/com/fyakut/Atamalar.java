package com.fyakut;

public class Atamalar {

    /** aritmetik atama işlemleri
     * +=,-=,*=,/=,&= operatörleri aynı anda iki işlemi birden yapmamızı soyluyor
     */
    public static void main(String[] args) {


        int a = 40;
        int b = 20;
        a += b;// a2ya yeni değer ata ve a ile topla demektr. a=a+b
        System.out.println("a nın yeni değeri:"+a);//a=60 olur
        a-=b;//a=a-b demektir/a son değeri 60 idi

        System.out.println("a nın çıkarma sonucu:"+a);//60-20=40
/**
 * çarpma, bolme ve mod da aynı şeklde yapılır
 */

/**
 * karşılastırma işlemleri
 * ==,=>,=<,<,></,>
 */
int x=5; int y=10;
        System.out.println(x<y);//true doner
        System.out.println(y<x);//false doner
        System.out.println(y<=x);//false doner
        System.out.println(y>=x);//true doner
        System.out.println(y==x);//false doner


        int g=5; int f=5;
        System.out.println(g==f);// eşit midir? true doner (tek eşit atama işlemidir)

        /**
         * if kullanımı = eğer kullnanımı
         */

        int birinciSayi=15; int ikinciSayi=12;
                if(birinciSayi>ikinciSayi){
                    System.out.println("1.sayi 2. sayidan büyüktür");
                }
        if(birinciSayi<ikinciSayi){
            System.out.println("1.sayi 2. sayidan küçüktür");
        }
        if(birinciSayi==ikinciSayi){
            System.out.println("1.sayi 2. sayiya eşit ise");
        }
    }


}
