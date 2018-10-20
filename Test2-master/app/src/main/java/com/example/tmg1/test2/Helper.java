package com.example.tmg1.test2;
import java.util.Random;


public class Helper {
    private Random rand = new Random();
    private int button = 0;
    private int number = 0;


    public Helper()
    {

    }
    public String quest(boolean toggle)
    {
        String ret = "";
            switch(rand.nextInt(4))
            {
                case 1:
                    ret = sol1(toggle);
                    break;
                case 2:
                    ret = sol2(toggle);
                    break;
                case 3:
                    ret = sol3(toggle);
                    break;
                case 4:
                    ret = sol4(toggle);
                    break;
                default: break;
            }



        return ret;
    }


    private String sol1(boolean toggle)
    {
            number = rand.nextInt(5);
            button = 4;
            return "You have a 1 in 4 chance of dying";


    }

    private String sol2(boolean toggle)
    {
            number = rand.nextInt(4);
            button = 3;
            return "You have a 1 in 3 chance of dying";
    }

    private String sol3(boolean toggle)
    {
            number = rand.nextInt(3);
            button = 2;
            return "You have a 1 in 2 chance of dying";
    }

    private String sol4(boolean toggle)
    {
            number = rand.nextInt(6);
            button = 5;
            return "You have a 1 in 5 chance of dying";
    }

    public int getButton()
    {
        return button;
    }

    public int getNumber()
    {
        return number;
    }







}
