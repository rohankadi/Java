package DataTypes;

public class ShortType {
    public static void main(String[] args) {
        // short distance = 30000;
        //short distance = 32767;
        //short distance = 32768; //error: incompatable types: possible lossy conversion from int to short
        //short distance = -32769; 
          short distance = -32768; //error:  incompatable types: possible lossy conversion from int to short


        System.out.println(distance);
        }
}
