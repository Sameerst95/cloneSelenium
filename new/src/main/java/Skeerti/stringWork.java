package Skeerti;

public class stringWork {
    public static void main(String[] args){

              //REVERSE OF STRING

        String st="Daddy";
        char[] ch=st.toCharArray();
        System.out.print("Reverse of the string "+st+" is:");
        for(int i=ch.length-1;i>=0;i--)
            System.out.print(ch[i]);

        //Retrieve the String "Balbir Singh"
        System.out.println();
        System.out.println();
        String ss = "A successful businessman,Balbir Singh has always tried to " +
                "discipline his son, but to no avail";
        System.out.println("The original sentence is:"+ss);
        String rt="Balbir singh";
        int b=ss.indexOf("Balbir Singh");
        if(ss.contains("Balbir Singh"))
            System.out.println("Retrieving a sub string and index: " + ss.substring(b, b + rt.length())+", "+b);
        else
            System.out.println("The word balbir singh does not exist");

            //Number of times ANIMAL word occurred

        String sk="A few weeks ago during the trailer launch of his new film Animal " +
                "actor Ranbir Kapoor called the film an 'adult-rated Kabhi Khushi Kabhie Gham'." +
                "The actor was putting it mildly when he described the film, helmed by Sandeep Reddy Vanga." +
                "It makes the toxicity of Kabir Singh and Arjun Reddy (both versions," +
                "in Hindi and Telugu original respectively, made by Vanga) seem negligible." +
                " Animal is not for the faint-hearted as the violence that you see in the" +
                "trailer is merely a small portion of what unfolds on screen for three hours and 21 minutes.";
        System.out.println();
        int n=0;
        String[] sa=sk.split(" ");
        for (String s : sa) {
            if (s.equalsIgnoreCase("animal"))
                n++;
        }
        System.out.println("The word ANIMAL occurred " + n +" times in the paragraph");

    }
}
