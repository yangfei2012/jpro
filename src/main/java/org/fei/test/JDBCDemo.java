package org.fei.test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import org.apache.commons.lang.time.StopWatch;

import java.sql.*;
import java.util.HashMap;

public class JDBCDemo {
    static Connection conn;
    static Statement st;

    static MongoClient mongo;
    static DB db;
    static DBCollection table;

    public static void query(int startIndex, int endIndex) {

        try {
            String sql = "select * from rpt_day_deal where "+ "id between "+startIndex+" and "+ endIndex +" order by id";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            System.out.println(10000);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            int _count = 0;
            while (rs.next()) {
                HashMap<String, Object> m = new HashMap<String, Object>(columns);
                for(int i=1; i<=columns; ++i){
                    m.put(md.getColumnName(i), rs.getObject(i));
                }
                Save2Mongo(m);
                if (++_count / 100000 != 0)
                    System.out.println(_count);
                //System.out.println(rs);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() {
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
            con = DriverManager.getConnection("jdbc:mysql://10.94.33.12:8613/niux_report", "nuomi_w", "nothing");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }

    public static void Save2Mongo(HashMap m) {

        try {
            BasicDBObject document = new BasicDBObject();
            document.putAll(m);
            table.insert(document);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void testMongoQuery() {
        StopWatch s = new StopWatch();
        s.start();

        s.stop();
        System.out.println("query time: " + s.getTime());
    }



    public static void main(String[] args) throws Exception{

        try {
            conn = JDBCDemo.getConnection();
            st = conn.createStatement();

            mongo = new MongoClient("10.94.33.12", 8123);
            db = mongo.getDB("niux_report");
            table = db.getCollection("rpt_day_deal");

            int _startIndex = 28352519;
            int _trunk = 10000;
            while (_startIndex <= 144994077) {
                JDBCDemo.query(_startIndex, _startIndex + _trunk);
                _startIndex += _trunk;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            conn.close();
        }
        //JDBCDemo.Save2Mongo();
        System.out.println("========================");
    }
}
