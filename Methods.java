public class Methods {

    static void myMethod (){
        System.out.println("I just executed");
    }
    
    static void sayHello (String name){
        System.out.println(name);
    }

    static int add(int num1, int num2){
        return num1 + num2;
    }

    
    static void sayHello (String name,int count){
        for (int i=0;i<count;i++){
            System.out.println(name);
        }
    }

    static void checkAge (int  age){
        if (age<18){
            System.out.println("Access denided- You are not old enough");
        }else{
            System.out.println("Access granted - You are old enough");
        }
    }


    

    public static void main(String[] args) {
       checkAge(15);
    }
}
