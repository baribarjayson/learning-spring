package com.loose.coupling;

public class NewUserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "User details from the new database";
    }
}
