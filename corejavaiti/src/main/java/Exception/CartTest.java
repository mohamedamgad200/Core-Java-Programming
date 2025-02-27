package Exception;

public class CartTest {
    public void add(String item) throws CartException {
        if (item == null) throw new CartException("Null Item Not Allowed");
        if (item.equals("Test")) throw new CartException("Duplicate Items Not Allowed");
        System.out.println(item);
    }

    public static void main(String[] args) {
        CartTest cartTest = new CartTest();
        try {
            //cartTest.add(null);
            //cartTest.add("Test");
            cartTest.add("Phone");
        } catch (CartException ex) {
            ex.printStackTrace();
        }
    }
}
