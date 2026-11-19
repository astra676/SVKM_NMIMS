class Q22 {
    public static void main(String[] args) {
        try { String s=null; System.out.println(s.length()); }
        catch(NullPointerException e) { System.out.println("Null Pointer"); }
        finally { System.out.println("Finally 1"); }
        try { System.out.println(10/0); }
        catch(ArithmeticException e) { System.out.println("Arithmetic"); }
        finally { System.out.println("Finally 2"); }
        try { int a[]={1,2}; System.out.println(a[5]); }
        catch(ArrayIndexOutOfBoundsException e) { System.out.println("Array Index"); }
        finally { System.out.println("Finally 3"); }
    }
}