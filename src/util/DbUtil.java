package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class DbUtil {
	/**
    *
    * jdbc������
    * dburl
    * dbusername
    * dbpassword
    * jdbcName
    *
    */
   private String dbUrl = "jdbc:mysql://localhost:3306/kingstore";
   private String dbUserName = "root";
   private String dbPassword = "password";

   private String jdbcName = "com.mysql.cj.jdbc.Driver";

   /**
    * ��ȡ���ݿ�����
    * return
    * throws Exception
    */
   public Connection getCon() throws Exception{
       Class.forName(jdbcName);
       Connection connection = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
       return connection;
   }
   /**
    * �ر����ݿ�
    * ����con����
    * throws Exception
    */
   public void closeCon(Connection connection) throws Exception{
       if (connection!= null){
           connection.close();
       }
   }
   /**
    * ����main������������
    */
   public static void main(String[] args){
       DbUtil dbUtil = new DbUtil();
       try {
           dbUtil.getCon();
           System.out.println("���ݿ����ӳɹ�");
       } catch (Exception e){
           e.printStackTrace();
       }
   }
public ResultSet searchSQL(String sql) {
	// TODO Auto-generated method stub
	return null;
}
}
