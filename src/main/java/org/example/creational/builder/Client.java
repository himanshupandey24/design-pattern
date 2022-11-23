package org.example.creational.builder;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;
        try{
            userExam = UserExam.getBuilder()
                    .setName("Himanshu")
                    .setMathsMarks(95)
                    .setEnglishMarks(85)
                    .setScienceMarks(95)
                    .build();
            UserExam userExam1 = UserExam.getBuilder().build();
        }
        catch (Exception exception){
           System.out.println(exception.getMessage());
        }
    }
}
