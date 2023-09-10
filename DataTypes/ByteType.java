package DataTypes;

public class ByteType {
    public static void main(String[] args) {
          byte a = 127;
        // byte a = 128; //throws an error : Type mismatch: cannot convert from int to byte
        //byte a = -128;
        // byte a = -129; ////throws an error : Type mismatch: cannot convert from int to byte
        System.out.println(a);
    }
}
