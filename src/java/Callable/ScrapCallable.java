/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callable;

import java.util.concurrent.Callable;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author sebastiannielsen
 */
public class ScrapCallable implements Callable<Group> {
    
    private String url;
    
    public ScrapCallable(String url) {
        this.url = url;
    }

    @Override
    public Group call() throws Exception {
        Document doc = Jsoup.connect(url).get();
        
        return new Group(doc.select("#authors").text(), doc.select("#class").text(), doc.select("#group").text());
    }
    

    
    
    
}
