package EX01to03;

public class EX01
{

    public static Boolean stringComp(String string1, String string2)
    {
        if (string1.equals(string2))
        {
            return true;
        }
        else
        {
            int i = string1.length() - 1, j = string2.length() - 1;

            while(i >= 0 && j >= 0)
            {
                if (string1.charAt(i) != string2.charAt(j)) {
                    return false;
                }

                i--;
                j--;
            }

            return true;
        }
    }
}

