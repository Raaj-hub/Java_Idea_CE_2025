package DesignPatterns;

import java.security.PublicKey;

public class TV_set {

    private static  TV_set tvsetInstance = null;
     private TV_set(String name)
    {
        System.out.println("TV_set instance created-->>"+name);
    }

   public static TV_set getTVSETinstance(String name)
    {
        if(tvsetInstance == null)
        {
            tvsetInstance = new TV_set(name);
        }
        return tvsetInstance;
    }

}
