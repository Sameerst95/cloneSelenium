package AssignmmentPackage;

import java.util.HashSet;

public class removeDuplicates
{

    public HashSet rmvDuplicates(String str)
    {
        HashSet<Character> hs = new HashSet();
        char[] chrArr = str.toCharArray();
        for(char c:chrArr)
        {
            hs.add(c);
        }
        System.out.println(hs);
        return hs;
    }
    public static void main(String[] args)
    {
        removeDuplicates rd = new removeDuplicates();
        HashSet rhs =  rd.rmvDuplicates("javaprotocolsummary");
        System.out.println(rhs);
    }

}
