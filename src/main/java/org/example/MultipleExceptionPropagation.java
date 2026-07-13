package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptionPropagation {
    public void processData() throws IOException, SQLException {

        FileReader file = new FileReader("data.txt");
        throw new SQLException("Database connection failed");
    }

    public static void main(String[] args) {

        MultipleExceptionPropagation d = new MultipleExceptionPropagation();

        try {
            d.processData();
        }
        catch (IOException e) {
            System.out.println("File Exception: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Database Exception: " + e.getMessage());
        }
    }
}
