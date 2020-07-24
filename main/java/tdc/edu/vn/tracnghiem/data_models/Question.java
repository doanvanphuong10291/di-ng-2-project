package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

public class Question {
    public  static ArrayList<AbtractQuestion> questions = new ArrayList<AbtractQuestion>();
    public static void intiallation()
    {
        // cau 1
        MultiQuestionMultiChoices qs1 = new MultiQuestionMultiChoices();
        qs1.setQuestionDrscription("Trong các mô hình mạng dưới đây, mô hình nào được dùng phổ biến hiện nay:");
        qs1.setQuestionChoices("Peer - to – Peer","Remote Access","Terminal Mainframe","Client – Server");
        qs1.setQuestionCorrect(0,3);
        questions.add(qs1);

        // cau 2
        MultiQuestionOneChoice qs2 = new MultiQuestionOneChoice();
        qs2.setQuestionDrscription("Dịch vụ mạng DNS dùng để làm gì?");
        qs2.setQuestionChoice("Cấp địa chỉ cho các máy trạm","Phân giải tên miền và địa chỉ IP","Truyền file và dữ liệu","Gửi thư điện tử");
        qs2.setQuestionCorrect(1);
        questions.add(qs2);

        // cau 3
        MatchingQuestion qs3 = new MatchingQuestion();
        qs3.setQuestionDrscription("Hãy tìm những đáp án đúng cho các mệnh đề dưới đây bằng cách nhấp chọn ô xổ xuống bên tay phải và lựa chọn câu trả lời:");
        qs3.setQuestionchoiseA(". Giao thức DHCP có thể cấp được...","Mô hình mạng dùng nhiều nhất...","Dịch vụ DNS dùng để ...");
        qs3.setQuestionchoiseB("Địa chỉ Mac","Địa chỉ IP","Subnet Mask","Client – Server","Phân giải tên và địa chỉ");
        qs3.setQuestionCorrect(1,3,4);
        questions.add(qs3);

        // cau 4
        TrueFalseQuestion qs4 = new TrueFalseQuestion();
        qs4.setQuestionDrscription("Hãy lựa chọn ĐÚNG hay SAI cho những mệnh đề dưới đây bằng cách nhấp chuột vào nút bên tay phải:");
        qs4.setTFQuestionchoise(". Giao thức DHCP có thể cấp được địa chỉ IP","Mô hình mạng phổ biến: Terminal – Mainframe","Dịch vụ DNS dùng để phân giải tên và địa chỉ");
        qs4.setQuestionCorrect(1,0,1);
        questions.add(qs4);

        // cau 5
        TrueFalseQuestion qs5 = new TrueFalseQuestion();
        qs5.setQuestionDrscription("Hãy lựa chọn ĐÚNG hay SAI cho những mệnh đề dưới đây bằng cách nhấp chuột vào nút bên tay phải:");
        qs5.setTFQuestionchoise(".Mô hình mạng phổ biến: Terminal – Mainframe","Giao thức DHCP có thể cấp được địa chỉ IP","Dịch vụ DNS dùng để phân giải tên và địa chỉ");
        qs5.setQuestionCorrect(0,1,1);
        questions.add(qs5);
        // cau 6
        TrueFalseQuestion qs6 = new TrueFalseQuestion();
        qs5.setQuestionDrscription("Hãy lựa chọn ĐÚNG hay SAI cho những mệnh đề dưới đây bằng cách nhấp chuột vào nút bên tay phải:");
        qs5.setTFQuestionchoise(".Mô hình mạng phổ biến: Terminal – Mainframe","Giao thức DHCP có thể cấp được địa chỉ IP","Dịch vụ DNS dùng để phân giải tên và địa chỉ");
        qs5.setQuestionCorrect(0,1,1);
        questions.add(qs5);
        // cau 7
        TrueFalseQuestion qs7 = new TrueFalseQuestion();
        qs5.setQuestionDrscription("Hãy lựa chọn ĐÚNG hay SAI cho những mệnh đề dưới đây bằng cách nhấp chuột vào nút bên tay phải:");
        qs5.setTFQuestionchoise(".Mô hình mạng phổ biến: Terminal – Mainframe","Giao thức DHCP có thể cấp được địa chỉ IP","Dịch vụ DNS dùng để phân giải tên và địa chỉ");
        qs5.setQuestionCorrect(0,1,1);
        questions.add(qs5);


    }
    private String sten;
    private int idiem;

    public Question(String sten,int idiem)
    {
        this.sten = sten;
        this.idiem = idiem;
    }


    public String getTen() {
        return sten;
    }

    public void setTen(String sten) {
        this.sten = sten;
    }

    public int getDiem() {
        return idiem;
    }

    public void setDiem(int idiem) {
        this.idiem = idiem;
    }


    @Override
    public String toString() {
        return sten + ":" + idiem;
    }
}

