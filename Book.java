package pr1.first.task.pr1;

public class Book {
    public String name; //Название книги
    private int numOfPages; // Кол-во страниц
    private String genre; //Возраст книги
    private boolean availability; //Наличие книги в магазине

    public Book(String n, int p, String g, boolean a)
    {
        name = n;
        numOfPages = p;
        genre = g;
        availability = a;
    }

    public void setName(String name) //Установить имя книге
    {
        this.name = name;
    }
    public String getName() { //Получить имя книги
        return name;
    }

    public void setGenre(String name) //Установить жанр книге
    {
        this.name = name;
    }
    public String getGenre() { //Получить жанр книги
        return name;
    }

    public void setNumOfPages(int numOfPages) { //Установить кол-во страниц книге
        this.numOfPages = numOfPages;
    }
    public int getNumOfPages() { //Получить кол-во страниц книги
        return numOfPages;
    }

    public void setAvailability(boolean availability) //Установить наличие книги
    {
        this.availability = availability;
    }
    public boolean getAvailability() // Узнать о наличии книги
    {
        return availability;
    }

    public String toString()
    {
        boolean curAvail = getAvailability();
        if (curAvail == true)
        {
            return "We have "+this.name+" in our shop, genre is"+this.genre+"num of pages is"+this.numOfPages;
        }
        else
        {
            return "Sorry, but we don't have "+this.name+" in our shop";
        }
    }
}
