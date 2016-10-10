package crawrler;
import java.io.*;
import java.net.*;

public class CrawlerDemo {

	public static void main(String[] args) {
     String url="http://www.baidu.com";
     String result="";
     BufferedReader in=null;
     try{
    	 URL realUrl=new URL(url);
    	 URLConnection connection=realUrl.openConnection();
        connection.connect();
        in =new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while((line=in.readLine())!=null){
        	result +=line;
        }
     }
     catch (Exception e) {System.out.println("发送GET请求出现异常！"+e);
     e.printStackTrace();
		// TODO: handle exception
     }
     finally{
    	 try{
    		 if(in!=null)
    			 in.close();
    	 }
    	 catch (Exception e2) {
    		 e2.printStackTrace();
			// TODO: handle exception
		}
     }
     System.out.println(result);
	}

}
