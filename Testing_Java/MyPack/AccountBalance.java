package MyPack;
class Balance {
    String name;
    double bal;

    Balance (String n, double b)
    {
        name = n;
        bal = b;
    }

    void show()
    {
        if (bal<0)
        {
            System.out.println ("Mr." + name + "your balance is less than zero rupees");
        }
        else
        {
            System.out.println(name + bal);
        }

    }
    }
class AccountBalance {
    public static void main(String[] args)
    {
        Balance current[] = new Balance[3];
        current[1] = new Balance("piyush", 10000000);
        current[2] = new Balance("umesh", 10000000);

        for(int i =0; i<2 ; i++)
        {
            current[i].show();
        }
    }

}
