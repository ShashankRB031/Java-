public class ComapreString {
    public static void main(String[] args) {
        String name1 ="Tony";
        String name2 ="Ton2y";
        // s1>s2 : +ve value
        // s1==s2 : 0
        // s1<s2  : -ve value

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
