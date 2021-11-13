package ru.mirea;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Lexa","lexa123@mail.ru",'m');
        Author a2 = new Author("Lena", "Lena321@mail.ru", 'f');

        a2.setEmail("NeLena234@mail.COM");
        a2.getEmail();
        a2.getName();
        a1.getGender();

        System.out.println(a1);
        System.out.println(a2);
    }
}
