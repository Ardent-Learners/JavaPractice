package com.homelearning;


import com.oops.Record;

public class  Instructor {

    int id;
    String name;
    String title;
    String department;
    Book[] books;
    Record record;

    public Instructor(int id, String name, String title, String department, Book[] books, Record record )
    {
        this(id,name,title, department);
        this.books = books;
        this.record = record;
    }
    public Instructor(int id, String name,String title, String department )
    {
        this(id, name, title);
        this.department= department;

    }
    public Instructor(int id, String name, String title)
    {
       this(id,name);
       this.title = title;
    }

    public Instructor(int id, String name)
    {
        this.id = id;
        this.name = name;

    }

    public String getRecentBook()
    {
        return books[books.length-1].getTitle();

    }

    public Book UpdateBook(int id, String title)
    {
        Book book5 = new Book(105,title);
        books[id] = book5;

        return book5;

    }

    void printData(){
        System.out.println("id:" + id + "\tname:" + name + "\ttitle:" + title + "\tdepartment:" + department + "\tbooks:"
        + books + "\tRecord: " + record.getName());
    }


        public static void main(String[] args)
        {
            Book book1 = new Book(101,"java for beginner");
            Book book2 = new Book(102,"Java advance");
            Book book3 = new Book(103, "C & C#");
            Book book4 = new Book(104,"php");
            Book[] books = {book1,book2,book3,book4};

            Record record = new Record("Intructor");

            Instructor instructor = new Instructor(1, "Hamid", "hod",
                    "Comp", new Book[]{book1,book2}, record);

            instructor.printData();



            }
        }



