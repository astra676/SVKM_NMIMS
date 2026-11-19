class Q21 {
    public static void main(String[] args) {
        try { System.out.println(10/0); }
        catch(ArithmeticException e) { System.out.println("Division Error"); }
        try { int a[]={10,20}; System.out.println(a[5]); }
        catch(ArrayIndexOutOfBoundsException e) { System.out.println("Array Error"); }
    }
}