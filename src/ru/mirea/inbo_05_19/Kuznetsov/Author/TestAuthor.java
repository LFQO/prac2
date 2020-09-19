package ru.mirea.inbo_05_19.Kuznetsov.Author;

public class TestAuthor {
    public static void main(String args[]){
        Author first, second;
        first=new Author("Vitaliy Gromyako","arthas@gmail.com",'m');
        second=new Author("Oleg Bocharov","qwerty123v@gmail.com",'m');
        second.setEmail("test82@gmail.com");
        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}