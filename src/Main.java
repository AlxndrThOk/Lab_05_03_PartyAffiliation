public class Main {
    public static void main(String[] args)
    {
        String partyAffiliation = "";
        System.out.println("What is your party affiliation? D/R/I/Other");
        partyAffiliation = "Other";
        if (partyAffiliation == "D")
        {
            System.out.println("You got a democratic donkey");
        }
        else if (partyAffiliation == "R")
        {
            System.out.println("You got a republican elephant");
        }
        else if (partyAffiliation == "I")
        {
            System.out.println("You got an independent man");
        }
        else
        {
            System.out.println("You got other other");
        }
    }
}