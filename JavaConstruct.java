public class JavaConstruct {
    //constructor
    int x;
    public JavaConstruct(){
        x = 1000;
    }
    public static void main(String args[]){
        JavaConstruct obj = new JavaConstruct();
        System.out.println(obj.x);
    }
}
