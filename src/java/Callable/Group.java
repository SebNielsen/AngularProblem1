/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callable;

/**
 *
 * @author sebastiannielsen
 */
public class Group {
    String authors;
    String ClassName;
    String groupNumber;

    public Group(String authors, String ClassName, String groupNumber) {
        this.authors = authors;
        this.ClassName = ClassName;
        this.groupNumber = groupNumber;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    
    
    
}
