package org.example;

import org.example.database.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
        Author author1 = new Author(1, "Paul", "Deitel");
        Author author2 = new Author(2, "Robert", "Martin");
        Author author3 = new Author(3, "Harold", "Abelson");
        Author author4 = new Author(4, "Steve", "McConnell");
        Author author5 = new Author(5, "Donald", "Knuth");
        Book book1 = new Book(1, "Java: Early Objects", 2015, author1.getId());
        Book book2 = new Book(2, "Clean Code", 2008, author2.getId());
        Book book3 = new Book(3, "SICP", 1996, author3.getId());
        Book book4 = new Book(4, "Code Complete", 2004, author4.getId());
        Book book5 = new Book(5, "Art of Computer Programming", 2011, author5.getId());

        // DB CONNECTION
        final Connection DB = DbConnection.connect();

        // CREATE TABLE AUTHORS
        String authorsTableCreate = "create table AUTHORS " + "(AUTHOR_ID integer NOT NULL, " +
                "AUTHOR_FIRSTNAME varchar(40) NOT NULL, " + "AUTHOR_LASTNAME varchar(40) NOT NULL, " +
                "PRIMARY KEY (AUTHOR_ID))";

        // CREATE TABLE BOOKS
        String booksTableCreate = "create table BOOKS " + "(BOOK_ID integer NOT NULL, " +
                "BOOK_TITLE varchar(40) NOT NULL, " + "BOOK_YEAR integer NOT NULL, " + "AUTHOR_ID integer NOT NULL, " +
                "PRIMARY KEY (BOOK_ID), " + "FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHORS (AUTHOR_ID))";

        try (Statement stmt = DB.createStatement()) {
            stmt.executeUpdate(authorsTableCreate);
            System.out.println("Created table AUTHORS.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (Statement stmt = DB.createStatement()) {
            stmt.executeUpdate(booksTableCreate);
            System.out.println("Created table BOOKS.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /**
         *
         * INSERT INTO AUTHORS
         *
         * */
        try {
            PreparedStatement ps1 = DB.prepareStatement("insert into AUTHORS " + "values(?, ?, ?)");
            ps1.setInt(1, author1.getId());
            ps1.setString(2, author1.getFirstName());
            ps1.setString(3, author1.getLastName());

            PreparedStatement ps2 = DB.prepareStatement("insert into AUTHORS " + "values(?, ?, ?)");
            ps2.setInt(1, author2.getId());
            ps2.setString(2, author2.getFirstName());
            ps2.setString(3, author2.getLastName());

            PreparedStatement ps3 = DB.prepareStatement("insert into AUTHORS " + "values(?, ?, ?)");
            ps3.setInt(1, author3.getId());
            ps3.setString(2, author3.getFirstName());
            ps3.setString(3, author3.getLastName());

            PreparedStatement ps4 = DB.prepareStatement("insert into AUTHORS " + "values(?, ?, ?)");
            ps4.setInt(1, author4.getId());
            ps4.setString(2, author4.getFirstName());
            ps4.setString(3, author4.getLastName());

            PreparedStatement ps5 = DB.prepareStatement("insert into AUTHORS " + "values(?, ?, ?)");
            ps5.setInt(1, author5.getId());
            ps5.setString(2, author5.getFirstName());
            ps5.setString(3, author5.getLastName());

            PreparedStatement[] preparedStatements = {ps1, ps2, ps3, ps4, ps5};
            int insertCount = 0;

            for(PreparedStatement stmt : preparedStatements) {
                stmt.executeUpdate();
                insertCount += 1;
            }

            System.out.println("Inserted " + insertCount + " row(s) into AUTHORS.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /**
         *
         * INSERT INTO BOOKS
         *
         * */
        try {
            PreparedStatement ps1 = DB.prepareStatement("insert into BOOKS " + "values(?, ?, ?, ?)");
            ps1.setInt(1, book1.getId());
            ps1.setString(2, book1.getTitle());
            ps1.setInt(3, book1.getYear());
            ps1.setInt(4, book1.getAuthorId());

            PreparedStatement ps2 = DB.prepareStatement("insert into BOOKS " + "values(?, ?, ?, ?)");
            ps2.setInt(1, book2.getId());
            ps2.setString(2, book2.getTitle());
            ps2.setInt(3, book2.getYear());
            ps2.setInt(4, book2.getAuthorId());

            PreparedStatement ps3 = DB.prepareStatement("insert into BOOKS " + "values(?, ?, ?, ?)");
            ps3.setInt(1, book3.getId());
            ps3.setString(2, book3.getTitle());
            ps3.setInt(3, book3.getYear());
            ps3.setInt(4, book3.getAuthorId());

            PreparedStatement ps4 = DB.prepareStatement("insert into BOOKS " + "values(?, ?, ?, ?)");
            ps4.setInt(1, book4.getId());
            ps4.setString(2, book4.getTitle());
            ps4.setInt(3, book4.getYear());
            ps4.setInt(4, book4.getAuthorId());

            PreparedStatement ps5 = DB.prepareStatement("insert into BOOKS " + "values(?, ?, ?, ?)");
            ps5.setInt(1, book5.getId());
            ps5.setString(2, book5.getTitle());
            ps5.setInt(3, book5.getYear());
            ps5.setInt(4, book5.getId());

            PreparedStatement[] preparedStatements = {ps1, ps2, ps3, ps4, ps5};
            int insertCount = 0;

            for(PreparedStatement stmt : preparedStatements) {
                stmt.executeUpdate();
                insertCount += 1;
            }

            System.out.println("Inserted " + insertCount + " row(s) into BOOKS.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // SELECT FROM AUTHORS
            PreparedStatement psAuthors = DB.prepareStatement("select * from AUTHORS");

            // SELECT FROM BOOKS
            PreparedStatement psBooks = DB.prepareStatement("select BOOKS.BOOK_ID, BOOKS.BOOK_TITLE, BOOKS.BOOK_YEAR, AUTHORS.AUTHOR_FIRSTNAME, AUTHORS.AUTHOR_LASTNAME " +
                    "from BOOKS" + " inner join AUTHORS on BOOKS.AUTHOR_ID = AUTHORS.AUTHOR_ID");

            ResultSet authorsSet = psAuthors.executeQuery();
            ResultSet booksSet = psBooks.executeQuery();

            System.out.println();
            System.out.println("===AUTHORS===");
            System.out.println();

            while(authorsSet.next()) {
                System.out.println("ID: " + authorsSet.getInt("AUTHOR_ID") + " | "
                        + "First Name: " + authorsSet.getString("AUTHOR_FIRSTNAME") + " | "
                        + "Last Name: " + authorsSet.getString("AUTHOR_LASTNAME"));
            }

            System.out.println();
            System.out.println("===BOOKS===");
            System.out.println();

            while(booksSet.next()) {
                System.out.println("ID: " + booksSet.getInt("BOOK_ID") + " | "
                + "TITLE: " + booksSet.getString("BOOK_TITLE") + " | "
                + "YEAR: " + booksSet.getInt("BOOK_YEAR") + " | "
                + "AUTHOR: " + booksSet.getString("AUTHOR_FIRSTNAME") + " "
                + booksSet.getString("AUTHOR_LASTNAME"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}