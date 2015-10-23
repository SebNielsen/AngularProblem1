/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sebastiannielsen
 */
public class ScrapingContent {
   private final static List<Future<Group>> futures = new ArrayList(); 
   
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (String url : urls) {
            Future fut = executor.submit(new ScrapCallable(url));
            futures.add(fut);
        }
        
        for (Future<Group> future : futures) {
            Group group = future.get();
            System.out.println("Authors:"  + group.authors + " GroupNumber: " + group.groupNumber + " Class: " + group.ClassName);
        }

        executor.shutdown();
        executor.awaitTermination(15, TimeUnit.SECONDS);
    }
    
   public static List<String> urls = new ArrayList<String>() {
    {

      //Class A
//      add("http://cphbusinessjb.cloudapp.net/CA2/");
      add("http://ca2-ebski.rhcloud.com/CA2New/");
//      add("http://ca2-chrislind.rhcloud.com/CA2Final/");
      add("http://ca2-pernille.rhcloud.com/NYCA2/");
//      add("https://ca2-jonasrafn.rhcloud.com:8443/company.jsp");
      add("http://ca2javathehutt-smcphbusiness.rhcloud.com/ca2/index.jsp");

      //Class B
      add("https://ca2-ssteinaa.rhcloud.com/CA2/");
//      add("http://tomcat-nharbo.rhcloud.com/CA2/");
      add("https://ca2-cphol24.rhcloud.com/3.semCa.2/");
      add("https://ca2-ksw.rhcloud.com/DeGuleSider/");
      add("http://ca2-ab207.rhcloud.com/CA2/index.html");
//      add("http://ca2-sindt.rhcloud.com/CA2/index.jsp");
      add("http://ca2gruppe8-tocvfan.rhcloud.com/");
      add("https://ca-ichti.rhcloud.com/CA2/");

      //Class COS
      add("https://ca2-9fitteen.rhcloud.com:8443/CA2/");
      add("https://cagroup04-coolnerds.rhcloud.com/CA_v1/index.html");
//      add("http://catwo-2ndsemester.rhcloud.com/CA2/");
    }
  };
}
