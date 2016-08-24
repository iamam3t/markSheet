
package com.leapfrog.classpractice;

import com.leapfrog.classpractice.util.MarkSheet;


public class Program {

    
    public static void main(String[] args) {
        MarkSheet m = new MarkSheet();
        
        m.setStudents();
        m.setSubjects();
        m.setMarks();
        m.setTotal();
        m.setPrecentage();
        m.setGrade();
        m.result();
    }
    
}
