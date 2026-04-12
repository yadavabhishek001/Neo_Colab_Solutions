public class Unit4_Lec27_Q3 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10 / 0;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Exception");
        }
        System.out.println("Hello " + a);
    }
}
