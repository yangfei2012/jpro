package org.fei.test.mongo;


import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MClient {

    private MongoClient mongo;
    private DB db;
    private DBCollection coll;

    public MClient(MongoConfig cfg) throws Exception {
        try {
            mongo = new MongoClient(cfg.getHost(), cfg.getPort());
            db = mongo.getDB(cfg.getDb());
            coll = db.getCollection(cfg.getCollection());
        } catch (UnknownHostException e) {
            System.out.println("The host is error, cfg: " + cfg);
            throw new Exception(e.getMessage());
        }
    }

    public void simpleQuery() {
        BasicDBObject doc = new BasicDBObject("date", 20120701);
        DBCursor cursor = coll.find(doc);

        //System.out.println("cursor size: " + cursor.size());
//        while(cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }
    }

    public void filterQuery() {
        //BasicDBObject doc = new BasicDBObject("date", new BasicDBObject("$lte", 20120701));
        BasicDBObject doc = new BasicDBObject("date", new BasicDBObject("$gte", 20120701).append("$lte", 20120801));
        //BasicDBObject doc = new BasicDBObject("date", new BasicDBObject("$lte", 20120701));
        //BasicDBObject doc = new BasicDBObject("date", new BasicDBObject("$lte", 20120701));
        DBCursor cursor = coll.find(doc);

        //System.out.println("cursor size: " + cursor.size());
//        while(cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }
    }

    public void concurrencyQuery() {
        int _runTimes = 2000;

        final BasicDBObject doc = new BasicDBObject("date", new BasicDBObject("$gte", 20120701).append("$lte", 20120801));

        final CountDownLatch startSignal = new CountDownLatch(1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0; i<_runTimes; i++) {
            final int _count = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        startSignal.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int j=0; j<10; j++) {
                        DBCursor cursor = coll.find(doc);
                    }
                    System.out.println(_count);
                }
            });
        }

        startSignal.countDown();
    }

}
