package AssignmmentPackage;
public class assignments
{
    /* ---Assignments---
    #assignment 1#
    void method-->find sum of 1st n(10) integers
    int method-->find sum of 1st n integers
    main method shd have 3 lines

    #assignment 2#
    find sum of first n integers-starts with 0

    #assignment 3#
    modify same assignment using method overloading(1-20)
    */
    void vFindSum()
    {
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
    int iFindSum()
    {
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        return sum;
    }

    //2 assignemnt : find sum of first n integers-starts with 0
    int findSum(int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    //3 assignemnt
    int findSum(int startNum,int numsToAdd)
    {
        int sum = 0;
        for(int i=startNum;i<=(startNum+numsToAdd);i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    int findSum(int[] nums)
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum +nums[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        //#assignment 1#
        assignments asg = new assignments();
        asg.vFindSum();
        System.out.println("int Sum = "+asg.iFindSum());

        //#assignment 2#
        System.out.println(asg.findSum(20));

        //#assignment 3#
        int tot = asg.findSum(5,6);
        System.out.println(tot);
        int[] numbersToAdd = {5,10,15,20,25};
        tot = asg.findSum(numbersToAdd);
        System.out.println(tot);

    }
}

