import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int ans=1;
        for(int i=1;i<=x;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
