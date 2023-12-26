package src.Dec2023;

public class Lab_002_Operators {
    public static void main(String[] args) {
        //1.Assignment
        int a = 100;

        //2.Comparision
        int b = 100, c = 100;
        System.out.println(b==c);
        String s1= "java", s2= "python";
        System.out.println(s1==s2);

        //3.Arithmatic
        int m=100, n= 50;
        System.out.println(m+n);
        System.out.println(m-n);
        System.out.println(m*n);
        System.out.println(m/n);
        System.out.println(m%n);

        //4.concatination
        String k1="kalyan";
        String k2= "kumar";
        System.out.println(k1+k2);

        //5. Relational opeartor
        int e= 100, f=200, g=300, h=300;


        //6.not operator
//        boolean a= true;
//        System.out.println(a);
//        boolean a= true;
//      System.out.println(!a);
        boolean x= true;
        System.out.println(!(10<20));


        //7.OR Operator
        int y=12;
        boolean z= (b>10 || b<5);


        //8.Relational Operator
        int k =10;
        int l =20;
        // boolean o = (a==b);
        //System.out.println(o);

//        boolean c= (a<b);
//        System.out.println(c);

//         boolean c= (a>b);
//          System.out.println(c);
        boolean o= (a<=b);
        System.out.println(c);


        String name = "The Testing Academy"; //Strored in SPool Area

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

    }
}
