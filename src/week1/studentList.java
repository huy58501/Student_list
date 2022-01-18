/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author chuong5850
 */
public class studentList {
    public static void main(String[] args){
        Student[] studentList = new Student[3];
        studentList[0] = new Student("01","John A");
        studentList[1] = new Student("02","John B");
        studentList[2] = new Student("03","John C");
        
        for (int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentID() + "\t" + studentList[i].getStudentName());
        }
    }
}
