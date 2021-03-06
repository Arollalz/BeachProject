package beach.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mlding on 8/11/15.
 */
public class Bank {

    List<Customer> customerList = new ArrayList<>();

    public boolean IsNamelegal(String name){
        if (name == null) return false;
        return name.matches("^[a-z0-9]+$");
    }


    public boolean IsNameRepeat(Customer customer) {
        for (Customer temp : customerList) {
            if (temp.getNickname().equals(customer.getNickname()))
                return true;
        }
            return false;
    }

    public boolean IsValidCustomer(Customer customer) {

        boolean Namelegal = IsNamelegal(customer.getNickname());
        boolean Isrepeat = IsNameRepeat(customer);
        if (Namelegal && !Isrepeat) {
            customerList.add(customer);
            return true;
        } else {
            return false;
        }
    }

    }

