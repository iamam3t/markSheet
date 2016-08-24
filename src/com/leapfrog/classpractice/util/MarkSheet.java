
package com.leapfrog.classpractice.util;

import java.util.Scanner;

public class MarkSheet {
    Scanner name = new Scanner(System.in);
    public String[] students=new String[3], subjects=new String[4], grade=new String[students.length];
    public double[][] marks= new double[students.length][subjects.length];
    public double passMark=32,fullMark=100;
    public double[] total=new double[students.length],percentage=new double[students.length];
    public int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

    public void setStudents() {
        System.out.println("Enter the name of the Students:");
        for(int i=0; i<students.length;i++){
            students[i]=name.next();
        }
    }//Setting the name of Students
    public void setSubjects(){
        System.out.println("Enter the name of the Subjects:");
        for(int i=0; i<subjects.length;i++){
            subjects[i]= name.next();
        }
    }//Setting the name of Subjects
    public void setMarks() {
        for(int i=0; i<students.length;i++){
            System.out.println("Enter the marks of the Student : "+students[i]);
            for(int j=0; j<subjects.length;j++){
                System.out.print(subjects[j]+" :");
                marks[i][j] = name.nextDouble();
            }
            System.out.println();
        }
    }//Setting the marks of individual Subjects

    public void setTotal() {
        for(int i=0; i<students.length;i++){
            for(int j=0; j<subjects.length;j++){
                total[i] += marks[i][j];
            }
        }
    }//finding the total marks of individuals students
    
    public void setPrecentage(){
        for(int i=0; i<students.length;i++){
            boolean isFail = false;//to check pass or fail condition must be false
            for(int j=0; j<subjects.length;j++){
                if(marks[i][j]<passMark){
                   isFail = true; 
                }
            }
            if(isFail){
                percentage[i]= 0;
            }else{
                percentage[i]=(total[i]/(fullMark*subjects.length))*100;
            }
        }
    }//finding the percentage of individuals students
    
    public void setGrade(){
        for(int i=0; i<students.length;i++){
            if(percentage[i]>=80){
                grade[i] = "Distinction";
                count1++;
            }else if(percentage[i]<80 && percentage[i]>=60){
                grade[i] = "First Division";
                count2++;
                }else if(percentage[i]<60 && percentage[i]>=45){
                    grade[i] = "Second Division";
                    count3++;
                    }else if(percentage[i]<45 && percentage[i]>=32){
                        grade[i] = "Third Division";
                        count4++;
                    }else{
                        grade[i] = "Fail";
                        count5++;
                        }  
        }
    }//finding the grade of individuals students
    
    public void result(){
        double temp=0;
        int k=0;
        for(int i=0; i<students.length;i++){
            if(temp<total[i])
                temp=total[i];
                k=i;
            }
        for(int i=0; i<students.length;i++){
            System.out.println("Name: "+students[i]);
            System.out.println("Marks obtained:");
            for(int j=0; j<subjects.length;j++){
                System.out.println(subjects[j]+" : "+marks[i][j]);
            }
            System.out.println("Total : "+total[i]);
            System.out.println("Percentage : "+percentage[i]+"%");
            System.out.println("Grade : "+grade[i]);
            System.out.println("");
        }
        System.out.println("No of students passed with Distinction : "+count1);
        System.out.println("No of students passed with 1st Division : "+count2);
        System.out.println("No of students passed with 2nd Division : "+count3);
        System.out.println("No of students passed with 3rd Division : "+count4);
        System.out.println("No of failed students : "+count5);
        System.out.println("");
        //Details of Board Topper
        System.out.println("Student who top the Board is : ");
        System.out.println("Name : "+students[k]);
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]+"  : "+marks[k][i]);
        }
        System.out.println("Total : "+total[k]);
        System.out.println("Percentage : "+percentage[k]+"%");
        System.out.println("Grade : "+grade[k]);
        System.out.println("");
    }//Displaying All Data
}


    

