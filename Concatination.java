public class Concatination {
    public static void main(String[] args) {
        String firstname ="Shashank";
        String lastName ="B";
        String fullName = firstname+" "+lastName;
        System.out.println(fullName);

        //Length
        System.out.println("Length of Your name is " + fullName.length());

        //charAt : returns all char in string 
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
