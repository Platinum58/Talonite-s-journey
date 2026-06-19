
public class length{
    public static void main(String[] args){
        String name = "Programming";
        System.out.println("length of string: " + name.length());
        System.out.println("First characte: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1) );
        if(name.equals("Programming")){
            System.out.println("equal");
        }
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(4));
        System.out.println(name.indexOf('g'));
        System.out.println(name.indexOf('z'));
    }
}