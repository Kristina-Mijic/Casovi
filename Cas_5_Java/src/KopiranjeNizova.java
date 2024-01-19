public class KopiranjeNizova {
    public static void main(String[] args) {

                                //plitko ili kopiranje po referenci
        //referenca - znaci memorijski prostor / memorijska adresa


//
//        int[] a = {3, 20, -4, 7};
//        int[] b;
//        b = a;
//
//        a[0] = 9;
//        System.out.println( "Niz a je: ");
//        for(int pivot:a) {
//            System.out.println(pivot);
//        }
//
//        System.out.println( "Niz b je: ");
//        for(int pivot:b) {
//            System.out.println(pivot);
//        }

                             //klasicno ili duboko kopiranje - idemo element po element

        int[] c = {33, -12, 8, 90};
        int[] f = new int[4];

        for(int i = 0; i < c.length; i++) {
            f[i] = c[i];
        }

        System.out.println( "Niz c je: ");
        for(int pivot:c) {
            System.out.println(pivot);
        }

        System.out.println( "Niz f je: ");
        for(int pivot:f) {
            System.out.println(pivot);
        }

    }
}
