package week03;

public class P09_StringManupilation {
    public static void main(String[] args) {

        String login="Uye Girisi";
        System.out.println(login.contains("Uye"));
        System.out.println(login.isEmpty());
        String marka="Wise3@*9 Quarter";
        marka=marka.replaceAll("\\d","");
        System.out.println(marka);
        marka=marka.replaceAll("\\W","5");
        System.out.println(marka);
    }
}
