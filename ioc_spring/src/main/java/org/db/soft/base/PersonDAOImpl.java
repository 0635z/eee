package org.db.soft.base;

public class PersonDAOImpl implements PersonDAO{
    @Override
    public String operation(String name) {

        return "my name is" + name;
    }
}
