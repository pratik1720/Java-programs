package com.shape;

public class ArmStrong500 {
   public static void main(String[] args) {
    int arm,a;
    int i;
     int n;
    for ( i = 1; i<=500; i++) {
         arm=0;
         n=i;
        while(n>0){
             a=n%10;
            arm=arm+a*a*a;
            n=n/10;
        }
       if(arm==i){
            System.out.println(i);
        }
    }
     
   } 
}
