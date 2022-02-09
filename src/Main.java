import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

        // before:
        System.out.println(names);

        // complete code below to traverse the arraylist and insert "HELLO" after any
        // name that contains the letter "i"
        for (int i = 0; i< names.size() - 1; i++)
        {
            if (names.get(i).contains("i"))
            {
                names.add(i + 1,"HELLO");
                i++;
            }
        }

        // after:
        System.out.println(names);

        System.out.println("-------------------");

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Jessica");
        names2.add("Emily");
        names2.add("Destiny");
        names2.add("Mateo");
        names2.add("Sofia");
        names2.add("Tim");
        names2.add("James");

        // before:
        System.out.println(names2);

        // complete code below to traverse the arraylist and remove all
        // names that are exactly 5 letters long
        for (int i = 0; i <= names2.size() - 1; i++)
        {
            if (names2.get(i).length() == 5)
            {
                names2.remove(i);
                i--;
            }
        }

        // after:
        System.out.println(names2);

    }
}
