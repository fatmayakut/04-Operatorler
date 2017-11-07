package com.fyakut;

public class Main {

    public static void main(String[] args) {
        //=,-,*,/,+,%
        /**
         * = bir atama işlemidir.+ toplama,-çıkarma, * çarpma, %mod alma
         */
        int a=10; //a ya 10 nu ata demektir.
        int b=20;
        System.out.println("a+b="+( a+b));//cıktı=30
        int c=a+b;
        System.out.println("c:"+c);//çıktı=30

        int fark=a-b;
        System.out.println(fark);//çıktı=-10

        int carpma=a*b;
        System.out.println(carpma);//200

        //ondalıklı oldugundan tip donusumu yapılır.
        float bol=(float) a/(float)b;
        System.out.println(bol);//0.5

        //% mod alma bolumden kalan sayı demektir
        int mod=b%a;
        System.out.println(mod);//çıktı=20/10 kalan 0 mod o dır.

        //artırma-eksiltme işlemleri

        int s1=10;
        s1=s1+1;// 10+1 demek s1 artık 11 demektir.
        s1++;//1 artır demektr. 10+1 demek s1 artık 11 demektir.
        System.out.println(s1);

        int s2=10;
        s2=s2-1;// 10-1 demek s2 artık 9 demektir.
        s2--;//1 azalt demktr
        System.out.println(s2);


        // s1 suan 17, s2 suan 18 iken
        System.out.println(s1++);//çıktı o ankı degeri s1=17 olur artırma ekrana yazdıktan sonra arttrır
        System.out.println(s1);//s2 18 olur
        System.out.println(++s1);//önce artır sonra yazdır olur 19 yazdırır

        // s1 suan 17, s2 suan 18 iken
        System.out.println(s1--);//çıktı o ankı degeri s1=17 olur eksiltme ekrana yazdıktan sonra eksiltme
        System.out.println(s1);//s1 16 olur
        System.out.println(--s1);//önce azalt sonra yazdır olur 15 yazdırır
    }
}
