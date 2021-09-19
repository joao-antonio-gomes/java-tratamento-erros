public class TestConnection {
    public static void main(String[] args) {

        try (Connection con = new Connection()) {
            con.readData();
        }  catch (Exception e) {
            System.out.println("An error occurred while connecting");
        }

       /*Connection con = null;
        try {
            con = new Connection();
            con.readData();
        } catch (Exception e) {
            System.out.println("An error occurred while connecting");
        } finally {

        }*/
    }
}
