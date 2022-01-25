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
    private String studentId;
    private String studentName;
    private String address;
    
    public studentList(String studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public static void main(String[] args){
        Student[] studentList = new Student[4];
        studentList[0] = new Student("01","John A");
        studentList[1] = new Student("02","John B");
        studentList[2] = new Student("03","John C");
        
        for (int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentID() + "\t" + studentList[i].getStudentName());
        }
    }
}
