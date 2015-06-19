package org.fei.test.mongo;


public class MongoConfig {

    private String Host;
    private int port;
    private String db;
    private String Collection;


    public String toString() {
        return Host + "-" + port + " " + db + "-" + Collection;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getCollection() {
        return Collection;
    }

    public void setCollection(String collection) {
        Collection = collection;
    }
}
