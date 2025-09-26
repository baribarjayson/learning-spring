package com.fastFood.coupling;

public class fastFoodCoupling {
    public static void main(String[] args) {
        
        FoodProvider jollibee = new Jollibee();
        RestaurantManager jollibeeFoodProvider = new RestaurantManager(jollibee);
        System.out.println(jollibeeFoodProvider.selectRestaurant());

        FoodProvider mcdo = new Mcdo();
        RestaurantManager mcdoFoodProvider = new RestaurantManager(mcdo);
        System.out.println(mcdoFoodProvider.selectRestaurant());
    }
}