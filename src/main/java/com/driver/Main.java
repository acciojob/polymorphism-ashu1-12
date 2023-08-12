package com.driver;

  class Main {
     static class Product{
        public int product(int x, int y){return 0;}
        public  int product(int x, int y, int z){return 0;}

        public double product(double x, double y){return 0.2 ;}
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,3);
        p.product(1, 4, 5);
        p.product(1.2, 4.3);
    }

}