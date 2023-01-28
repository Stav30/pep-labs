public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    int result = 0;
     public int compare(char[] a, char[] b){
        for (int i = 0; i < Math.min(a.length,b.length);  i++) {
            if (a[i] < b[i]) {result = -1 ; }
            else if (a[i] > b[i]) {result = 1; }
            else if (a[i] == b[i]) {result = 0; }        
        }    
    return result; 
    }          
}
// Math.max(y.length,z.length);

    /* 
public class CharComparison {
    public static void main(String[] args){
        char[] a = {'d', 'a', 't'};
        char[] b = {'d', 'o', 'g'};
        
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (a[i] < b[j]) {System.out.println( -1 ); }
                else if (a[i] > b[j]) {System.out.println( 1); }
                else if (a[i] == b[j]) {System.out.println( 0); }

*/      