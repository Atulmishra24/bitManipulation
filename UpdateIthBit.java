public class UpdateIthBit{
 
    public static void setIthBit(int n , int i ){
        int bitMasks = 1<< i ;
        return n|bitMasks;
    }
    
    public static void clearIthBit(int n , int i ){
        int bitMasks =~(1<< i) ;
       return n&bitMarks;
    }
    public static void updateIthBit(int n , int i , int newBit){
        // if(newBit==1){
        //     return setIthBit(n,i);
        // }
        // else{
        //     return clearIthBit(n,i);
        // }
        n = clearIthBit(n,i);
        int bitMasks = newBit<<i;
        System.out.println(n| bitMasks);
    } 
    public static void main(String [] args){ 
        updateIthBit(10,1,1);
    }
}