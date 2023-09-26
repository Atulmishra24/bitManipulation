public class GetSetClearIthBit{

    public static void getIthBit(int n , int i ){
        int bitMasks = 1 << i;
        if((n & bitMarks) == 0){
            System.out.println("At this ith position :  0 is present" );
        }
        else{
            System.out.println("At this ith position :  1 is present" );
        }
    }
    public static void setIthBit(int n , int i ){
        int bitMasks = 1<< i ;
        System.out.println(n|bitMasks);
    }
    
    public static void clearIthBit(int n , int i ){
        int bitMasks =~(1<< i) ;
       System.out.println(n&bitMarks);
    }
    public static void main(String [] args){
        setIthBit(10,0);    
        getIthBit(10,2);
        clearIthBit(10,1);
    }
}