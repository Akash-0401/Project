package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurants {

    private  static Restaurants sRestaurants;
    private List<Restaurant> mRestaurants;

    private Restaurants()
    {
        mRestaurants = new ArrayList<>();


            Restaurant r = new Restaurant();
            r.setUrl("https://www.pizzahut.co.in/order/pizzas/");
            r.setName("Pizza Hut");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://pizzaonline.dominos.co.in/menu");
            r.setName("Domino's");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://ribbonsandballoons.com/");
            r.setName("Ribbons & Balloons");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://www.tacobell.co.in/");
            r.setName("Tacobell");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://sbarrodelivery.com/");
            r.setName("Sbarro");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://www.behrouzbiryani.com/");
            r.setName("Behrouz Biryani");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://www.99pancakes.in/");
            r.setName("99 pancakes");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://online.kfc.co.in/");
            r.setName("KFC");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://www.mcdelivery.co.in/");
            r.setName("MC Donalds");
            mRestaurants.add(r);

            r = new Restaurant();
            r.setUrl("https://www.burgerking.in/");
            r.setName("Burger King");
            mRestaurants.add(r);



    }

    public static Restaurants get()
    {
        if(sRestaurants == null)
        {
            sRestaurants = new Restaurants();
        }

        return sRestaurants;
    }
    public List<Restaurant> getRestaurants()
    {
        return mRestaurants;
    }

    public Restaurant getRestaurant(UUID id)
    {
            for(Restaurant r : mRestaurants)
            {
                if(r.getId().equals(id)) return r;
            }

            return null;
    }

}
