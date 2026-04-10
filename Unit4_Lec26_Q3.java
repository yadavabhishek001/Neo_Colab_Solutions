public class Unit4_Lec26_Q3 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Something went wrong");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}