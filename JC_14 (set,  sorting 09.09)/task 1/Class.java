package com.company;

public class Class implements Comparable<Class>{
    private String string;
    private int integer;

    public Class (String string, int integer){
        this.integer = integer;
        this.string = string;
    }

    public String getString(){
        return string;
    }

    public int getInteger(){
        return integer;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + integer;
        result = prime * result + ((string == null) ? 0 : string.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "  String: " + string + "    Integer: " + integer;
    }

    @Override
    public int compareTo(Class anotherString) {

        return this.string.compareTo(anotherString.getString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Class other = (Class) obj;
        if (integer != other.integer)
            return false;
        if (string == null) {
            if (other.string != null)
                return false;
        } else if (!string.equals(other.string))
            return false;
        return true;
    }



}
