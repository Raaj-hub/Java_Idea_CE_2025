package practiceHere;

public class Missing_number {
    public static void main(String[] args) {
        int n[] = {8,3,6,1,7,2,4};
        int sum = missingNumb(n);
        System.out.println(sum);
    }

    public static int missingNumb(int[] n)
    {
        int l = n.length+1;
        int sum=(l*(l+1))/2;
        for (int i=0;i<n.length;i++)
        {
            sum = sum - n[i];
        }
        return sum;
    }
}
