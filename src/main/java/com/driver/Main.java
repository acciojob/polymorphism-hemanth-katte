package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y){
            return x * y;
        }

        public int product(int x, int y, int z){
            return x * y * z;
        }

        public double product(double x, double y){
            return x * y;
        }
    }

    public static void main(String[] args){
        Product p = new Product();
        int x  = 1;
        int y = 2;
        int z = 3;
        double a = 1.2;
        double b = 1.4;
        int res1 = p.product(x,y);
        int res2 = p.product(x,y,z);
        double res3 = p.product(a,b);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);



    }
}