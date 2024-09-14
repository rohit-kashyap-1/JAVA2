### Java Classes -   We can create object of any class in any class main method, we can access class variables/attributes directly in another class

```jsx
public class JavaClass {
     int x = 5;
    public static void main(String[] args){
        JavaClass obj = new JavaClass();
        System.out.println(obj.x);
    }
}

```

```jsx
public class SecondClass {
    public static void main(String args[]){
        JavaClass obj = new JavaClass();
        obj.x = 1400;
        System.out.println(obj.x);
    }
}

```

### Java Methods -  public(accessed with only creating object) or static(can be accessed without creating object)

```jsx
public class JavaStatic {
    static void helloWorld(){
        System.out.println("Hello world from static method of the class");
    }
    public void publicFun(){
        System.out.println("Komal is so angryy woman");
    }
}

```

```jsx
public class Default {
    public static void main(String args[]){
        JavaStatic.helloWorld(); //use class name of static method | if in same class just funname();
        JavaStatic obj = new JavaStatic();
        obj.publicFun(); //public function only can be access with object
    }
}

```

### Java Contructor

**Note that the constructor name must match the class name, and it cannot have a return type (like `void`).**

**Also note that the constructor is called when the object is created.**

**All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.**

```jsx
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

```
