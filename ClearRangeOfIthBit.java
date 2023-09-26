public class ClearRangeOfIthBit{
   
   
    public static void clearRangebit(int n , int i , int j){
        int a = (~0)<<j+1;
        int b = (1<<i) -1;// (2^i-1 )-1
        int bitMasks = a | b;
        System.out.println(n & bitMasks);
    }
    public static void main(String [] args){

       clearRangebit(15,1,3);

    }
}