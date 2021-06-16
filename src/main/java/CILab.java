public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int capital = 0;

        for (int i=0; i < myString.length(); i++)
        {
            if (Character.isUpperCase(myString.charAt(i)))
            {
                capital++;
            }
        }

        if (capital == myString.length() || capital == 0)
        {
            return true;
        }
        return (capital == 1 && Character.isUpperCase(myString.charAt(0)));
    }

}

