
public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shashank");
        System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'K');
        // System.out.println(sb);

        //insert new car at beginning 
        sb.insert(0, 'R');
        System.out.println(sb);


        //delete char 
        sb.delete(0, 1);
        System.out.println(sb);

        //append new char

        sb.append(" R");
        System.out.println(sb);

        //length 
        System.out.println(sb.length());
        
    }
}
