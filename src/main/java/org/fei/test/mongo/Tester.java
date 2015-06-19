package org.fei.test.mongo;


import org.apache.commons.lang.time.StopWatch;

public class Tester {

    public static void main(String[] args) {
        try {
            MongoConfig cfg = new MongoConfig();
            cfg.setHost("10.94.33.12");
            cfg.setPort(8123);
            cfg.setDb("niux_report");
            cfg.setCollection("rpt_day_deal");

            MClient c = new MClient(cfg);

            StopWatch s = new StopWatch();
            s.start();
            //c.simpleQuery();
            //c.filterQuery();
            c.concurrencyQuery();
            s.stop();
            System.out.println("query time: " + s.getTime()/1000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
