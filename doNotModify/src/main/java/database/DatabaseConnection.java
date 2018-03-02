package database;

import java.util.Arrays;

public class DatabaseConnection {
    private Database database;
    private Credentials databaseCredentials;
    private int databaseTransactionRetryBehaviour;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Credentials getDatabaseCredentials() {
        return databaseCredentials;
    }

    public void setDatabaseCredentials(Credentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
    }

    public int getDatabaseTransactionRetryBehaviour() {
        return databaseTransactionRetryBehaviour;
    }

    public void applyDatabaseTransactionRetryBehaviour(int databaseTransactionRetryBehaviour) {
        this.databaseTransactionRetryBehaviour = databaseTransactionRetryBehaviour;
    }

    public Boolean connect() {
        if (database == null || !database.verify()) return false;
        if (databaseCredentials == null || !databaseCredentials.verify()) return false;
        if (!Arrays.asList(1, 2, 4, 8, 16).contains(databaseTransactionRetryBehaviour)) return false;
        return true;
    }
}
