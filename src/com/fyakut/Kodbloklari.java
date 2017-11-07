package com.fyakut;

public class Kodbloklari {
    /**
     * java 53 keyword anahtar kelime vardır bunlar kod yazarken aynı renk olup bu isimler ile aynı isme ait değişken tanımlanamaz
     * public,static void vb
     * int public=5 olamaz
     */

    // kod bloklari

int seviyeBlok1=5;
    {
        System.out.println(seviyeBlok1);//diğer seviyeler çağrılamaz farklı blok
        ;
        int seviyeBlok2=3;
        {
            System.out.println(seviyeBlok2);
            System.out.println(seviyeBlok1);//seviyeBlok3 çağrılamaz farklı blok

            int seviyeBlok3=6;
            {
                System.out.println(seviyeBlok2);
                System.out.println(seviyeBlok3);
                System.out.println(seviyeBlok1);
                // bütün seviyeler çağrılır aynı blok
            }
        }
    }
}
