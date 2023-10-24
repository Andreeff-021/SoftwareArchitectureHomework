package homework4.task2;

import homework4.task1.ComponentInfo;

public class CustomerProvider {

    private final Database database;

    public CustomerProvider(Database database){
        this.database = database;
    }

    public Customer getCustomer(String login, String password){

        return new Customer();
    }


}
