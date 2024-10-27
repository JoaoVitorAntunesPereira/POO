public class ExemploInteger {
    public static void main(String[] args) {
        String s1 = "10";
        System.out.println("s1 vale: " + s1);

        //Converter de String para int
        int i1 = Integer.parseInt(s1);
        System.out.println("i1 vale: " + i1);

        //Converter de Integer para String
        Integer i2 = 5;
        //Integer ix = new Integer(5); //deprecated
        s1 = i2.toString();
        s1 = Integer.toString(i2);
        s1 = Integer.toString(i1);

        float f1 = i2.floatValue() / 3;
        System.out.println("f1 vale: " + f1);
        System.out.println("f1 vale: "+ String.format("%.02f",f1));

        Integer i3 = 10;
        int i4 = 10;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}
