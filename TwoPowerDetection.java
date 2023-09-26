public class TwoPowerDetection{
    
    public static boolean isTwoPowerNo(int n ){
        return ((n)&(n-1)) == 0 ;
    } 

    public static void main(String [] args){
       System.out.println(isTwoPowerNo(8))

    }
}
