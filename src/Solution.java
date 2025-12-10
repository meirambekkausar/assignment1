public class Main {
    public static void main(String[] args) {

        //method is a block of code that is reusable when called()

        System.out.println(square(4));
        System.out.println(cube(4));
        String fullName = getFullName("Kausar","meirambekkyzy" ) ;
        System.out.println(fullName);
        int age = 18 ;
        if(ageCheck(age)){
            System.out.println("you may sign up");
        }
        else {
            System.out.println("You can hhhnot sign up mthfc");
        }

    }
    static void happyBirthday(String name,int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n" , name);
        System.out.printf("You are %d years old!\n" , age);
        System.out.println("Happy Birthday to you!");

    }
    static double square(double number) {
        return number*number ;
    }
    static double cube(double number) {
        return square(number) *number ;
    }
    static String getFullName(String first,String last){
        return first+ " " + last ;
    }
    static boolean ageCheck(int age) {
        if(age>=18){
            return true ;
        }
        else{
            return false ;
        }
    }
}

