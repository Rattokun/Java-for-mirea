package ru.mirea;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return "name of Author is "+this.name+", email is "+this.email+" gender is "+this.gender;
    }
}
