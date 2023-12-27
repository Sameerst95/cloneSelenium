package AssignmmentPackage;

import java.util.Scanner;
public class StringAssignment
{
    public static void main(String[] args)
    {
        Scanner scanOption = new Scanner(System.in);
        System.out.print("1. Reverse given String\n" +
                "2. Retrieve 'Balbir Singh'\n" +
                "3. Find 'Animal' occurrences\n" +
                "Enter String program to run from above : ");
        int getOption = Integer.parseInt(scanOption.nextLine());
        switch(getOption)
        {
            case 1:
                //1#.Reverse the given string-no use of in built method
                // take input
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter string to reverse : ");
                String str = scan.nextLine();
                StringReverse s = new StringReverse();
                System.out.println(s.reverseString(str));
                break;
            case 2:
                //2#."A successful businessman, Balbir Singh has always tried to discipline his son, but to no avail." --->Retrieve only 'Balbir Singh' from above sentence
                RetrieveString rs = new RetrieveString();
                String givenStr = "A successful businessman, Balbir Singh has always tried to discipline his son, but to no avail.";
                String strToChk = "Balbir Singh";
                int strIndex = rs.retrieveStr(givenStr, strToChk);
                if (strIndex != -1)
                {
                    System.out.println("'" + RetrieveString.strToRtv + "' Starts at index " + strIndex);
                }
                else
                {
                    System.out.println(RetrieveString.strToRtv + " Not Found!!");
                }
                break;
            case 3:
                /*
                3#. With a given para--->find out how many times the word 'animal' is occurring?
                "A few weeks ago during the trailer launch of his new film Animal, actor Ranbir Kapoor called the film an 'adult-rated Kabhi Khushi Kabhie Gham'. The actor was putting it mildly when he described the film, helmed by Sandeep Reddy Vanga.
                It makes the toxicity of Kabir Singh and Arjun Reddy (both versions, in Hindi and Telugu original respectively, made by Vanga) seem negligible. Animal is not for the faint-hearted as the violence that you see in the trailer is merely a small portion of what unfolds on screen for three hours and 21 minutes."
                 */
                String strPara = "A few weeks ago during the trailer launch of his new film Animal, actor Ranbir Kapoor called the film an 'adult-rated Kabhi Khushi Kabhie Gham'. The actor was putting it mildly when he described the film, helmed by Sandeep Reddy Vanga. It makes the toxicity of Kabir Singh and Arjun Reddy (both versions, in Hindi and Telugu original respectively, made by Vanga) seem negligible. Animal is not for the faint-hearted as the violence that you see in the trailer is merely a small portion of what unfolds on screen for three hours and 21 minutes.";
                String ocStr = "Animal";
                RetrieveString rso = new RetrieveString();
                int ocrCtr = rso.findStrOccurrence(strPara, ocStr);
                System.out.println("No of occurrences of '"+ocStr+"' is :" + ocrCtr);
                break;
            default:
                System.out.println("No valid option entered!!");

        }

    }
}
class StringReverse
{

    String strOriginal;
    StringReverse()
    {
        strOriginal="";
    }
    StringReverse(String str)
    {
        strOriginal=str;
    }
    public String reverseString()   //used when string initialized using constructor
    {
        String revString = new String();
        for(int i=this.strOriginal.length()-1;i>=0;i--)
        {
            //using charAt method
            revString = revString + this.strOriginal.charAt(i);
        }
        return revString;
    }

    public String reverseString(String strToReverse)
    {
        char[] chrArr = strToReverse.toCharArray();

        String revString = new String();
        for(int i=chrArr.length-1;i>=0;i--)
        {
            revString = revString + chrArr[i];
        }

        return revString;
    }

}
class RetrieveString
{
    static String containerStr;
    static String strToRtv;

    public int retrieveStr(String inStr, String chkStr)
    {
        int resultStartIndex = -1;
        containerStr = inStr;
        strToRtv = chkStr;
        if(containerStr.contains(strToRtv))
        {
            resultStartIndex = containerStr.indexOf(strToRtv);
        }
        return resultStartIndex;
    }

    public int findStrOccurrence(String strPara, String strToFind)
    {
        int ctrOcr = 0;
        String strTemp = strPara;

        int startIndex = retrieveStr(strPara,strToFind);
        //int startIndex = retrieveStr(strPara.toUpperCase(),strToFind.toUpperCase());

        while(startIndex != -1)
        {
            strTemp = strTemp.substring((startIndex+strToFind.length()));
            //strTemp = (strTemp.substring((startIndex+strToFind.length()))).toUpperCase();
            //System.out.println(strTemp);

            startIndex = retrieveStr(strTemp,strToFind);
            //startIndex = retrieveStr(strTemp.toUpperCase(),strToFind.toUpperCase());

            ctrOcr++;
        }
        return ctrOcr;
    }
}
