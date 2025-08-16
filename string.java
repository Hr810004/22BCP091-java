public class string {
    public static void main(String[] args) {

    //compareTo function in java
    //     String s1="Harsh";
    //     String s2="Harshr";
    //     if(s1.compareTo(s2)==0){
    //         System.out.println("Strings are equal");
    //     }
    //     else{
    //         System.out.println("Strings are not equal");
    //     } 

    //substring function in java
    // String s1="HarshRana";
    // String name=s1.substring(1,4);
    // System.out.println(name);

    //String builder concept
    StringBuilder s1= new StringBuilder("Harsh");
    s1.append("u");
    System.out.println(s1);
    System.out.println(s1.charAt(0));
    s1.setCharAt(5,'R');
    System.out.println(s1);
    s1.delete(5, 6);
    System.out.println(s1);
    System.out.println(s1.length());
    }
}