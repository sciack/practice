

import database.Credentials;
import database.Database;
import database.DatabaseConnection;
import database.Port;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;


/**
 * Convert this file to Kotlin, then alter the code to use the Kotlin expressions instead of assignment:
 * let, when, if, try, apply, run, with, also, use
 *
 * Can you reduce the entire function to a single expression with no return statement?
 */
public class DatabaseConnectionBuilder {

    public DatabaseConnection build(String username, String password, String host, int databasePortNumber) throws UnknownHostException {
        Credentials credentials = new Credentials(username);
        credentials.setCharsetForDatabase(Charset.defaultCharset());
        credentials.setPasswordForDatabase(password);

        Port port = new Port();
        port.setDatabasePortNumber(databasePortNumber);

        Database database = new Database();
        database.setDatabaseInetAddress(InetAddress.getByName(host));
        database.setDatabasePort(port);

        DatabaseConnection connection = new DatabaseConnection();
        connection.applyDatabaseTransactionRetryBehaviour(1);
        connection.setDatabaseCredentials(credentials);
        connection.setDatabase(database);
        return connection;
    }
}
