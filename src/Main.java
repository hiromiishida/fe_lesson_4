public class Main {
    public static void main(String[] args) {
        int ret;
        int age = 9;

        if(age <= 3) {
            ret = 100;
        }else if(age <= 9){
            ret = 300;
        }else{
            ret = 500;
        }

        System.out.println(ret);
    }
}