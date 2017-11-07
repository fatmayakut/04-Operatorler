package com.fyakut;

public class MantiksalOperatorlerIslemler {
    public static void main(String... args) {


        /**
         *
         * AND, OR,XOR,NOT
         */

        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean t = false;
        System.out.println("x&&y:"+(x && y));//çıktı false;
        System.out.println("y&&t:"+(y && t));//çıktı false;
        /** true=1, false =0 olarak düşünüldüğünde
         * x  &&  y çarpma olarak düşünüşlbişle  // her iki şartın sağlanması gerekir
         *1      1 =1 true
         *1      0=0 false
         *0      1=0 false
         *0     0=0   false
         *
         *
          */


        System.out.println("x||y:"+(x || y));//çıktı true;
        System.out.println("y||t:"+(y || t));//çıktı false;
        /** true=1, false =0 olarak düşünüldüğünde
         * x  ||  y  toplama olarak düşünülebilir  iki şarttan birinin sağlanması yeterli
         *1      1 =1 true
         *1      0=0 true
         *0      1=0 true
         *0     0=0   false
         *
         *
         */

        System.out.println("x^y:"+(x ^ y));//çıktı true; çok kullnılmıyor//
        // her ikisi true  ya da her ikisi false olduğunda true diğer durumlarda false

        System.out.println("x!:"+(!x));//ifadenin değili// true ise false -false ise true

        //işlem önceliği

        int a=2;int b=4; int c=5;
        System.out.println(a-b*3);//matematikteki öncelik sırası =-10
        System.out.println((a-c)+b*3);//parantez önceliği öncelik sırası =

    }

}
