public class ClearLastBit{


    public static void lastIthBitClear(int n , int i ){

        int bitMasks = ((~0)<< i);
        System.out.println(bitMasks);
        System.out.println(n & bitMasks);

    }
    public static void main(String [] args){


        lastIthBitClear(15,2);

    }
}