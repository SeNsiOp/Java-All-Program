public class array4 {
public static void main(String[] args) {
    char a[]= {'N','A','M','A','N'};
    int start= 0;
    int end = a.length-1;
    boolean flag =true;
    while (start<=end) {
        if(a[start]!=a[end])
        {
            flag= false;
            break;
        }
        start++;
        end--;
        
    }
    if(flag==true)
    System.out.println("Palindrome");
    else
    System.out.println("Not Palindrome");
}
    
}