package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.other.Adult;

public class SaveStudentOrder
{
//    scheduleStudentOrder
//    FinanceStudentOrder
    public static void main(String[] args) {
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

    }
    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:");

        return answer;
    }

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }
}
