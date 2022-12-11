package com.driver;

public class Main {

    static class Product{
        public int product(int x, int y){
            return x + y;
        }

        public int product(int x, int y, int z){
            return x + y + z;
        }

        public double product(double x, double y){
            return x - y;
        }
    }

    public static void main(String[] args){
        Product p = new Product();
        int x  = 14;
        int y = 21;
        int z = 11;
        double a = 954562352;
        double b = 984562;
        int res1 = p.product(x,y);
        int res2 = p.product(x,y,z);
        double res3 = p.product(a,b);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);



    }
}