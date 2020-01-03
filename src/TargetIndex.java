public class TargetIndex
{
    public static void main(String[] args)
    {
        int[] a={1,2,4,7,8};
        int tar=6;
        if(tar<=a[0])
            {
                System.out.println("Index of target is 0");
                return;
            }
        else if(tar>a[a.length-1])
            {
                System.out.println("Index of target is"+" "+ (a.length));
            }
        for(int i=0;i<a.length;i++)
        {
            if (tar <= a[i])
            {
                System.out.println("Index of target is" + " " + i);
                break;
            }
        }
    }
}

