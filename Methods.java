public class Methods {

    static void myMethod (){
        System.out.println("I just executed");
    }
    
    static void sayHello (String name){
        System.out.println(name);
    }
    
    static void sayHello (String name,int count){
        for (int i=0;i<count;i++){
            System.out.println(name);
        }
    }



    public static void main(String[] args) {
        myMethod();
        sayHello("Ali Duru");
        myMethod();
        sayHello("Aliye Duru");  
        sayHello("Ali Duru",105);    
    }
}
