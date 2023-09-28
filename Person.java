package PRO192;

public class Person {
    private String email,name,gioitinh,diachi,date;
    private int sdt;

    public Person(String email, String name,String date ,String gioitinh, String diachi, int sdt) {
        this.email = email;
        this.name = name;
        this.date=date;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public void changsdt(int newsdt)
    {
        this.sdt = newsdt;
    }

    public void changediachi(String newdiachi)
    {
        this.diachi=newdiachi;
    }


    public void Display()
    {
        System.out.println(this.email+"\n"+this.name+"\n"+this.date+"\n"+this.gioitinh+"\n"+this.sdt+"\n"+this.diachi);
    }

}

