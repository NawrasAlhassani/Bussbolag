package Test;

import java.sql.*;

public class MDBApp2 {
    public static void main(String[] args) throws SQLException {
        MDB2 mdb = new MDB2();

        for (Object[] row : mdb.getCrew(128)) {
            System.out.println(row[0]+" "+row[1]+" har roll: "+row[2]);
        }
        mdb.closeConnection();
    }
}
