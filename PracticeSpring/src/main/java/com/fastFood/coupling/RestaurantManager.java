package com.fastFood.coupling;

public class RestaurantManager {
    
    private FoodProvider fastFoodProvider;

    public RestaurantManager( FoodProvider fastFoodProvider ){
        this.fastFoodProvider = fastFoodProvider;
    }
    
    public String selectRestaurant(){
        return fastFoodProvider.selectRestaurant();
    }
}
