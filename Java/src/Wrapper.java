public class Wrapper {
    public static void main(String[] args) {
        Double d = 100.54879982;
        Integer i = d.intValue();
        System.out.println(i);

        double d2 = 3.765;
        int i2 = (int) d2;
        System.out.println(i2);

        // Integer object = new Integer("100"); @ Deprecated (indisponivel após java9)
        Integer object = Integer.valueOf("100");
        System.out.println(object);

        System.out.println(i.compareTo(object));
    }
}
