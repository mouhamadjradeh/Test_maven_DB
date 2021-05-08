public class APP {


    public static void main(String[] args) {
        System.out.println("hi");
        try{
              Class.forName("com.postgresql.jdbc.driver");} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
