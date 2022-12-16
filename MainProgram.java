public class MainProgram {
    public static void main(String[] args) {
        Customer geri = new Customer();
        geri.nama = "Geri Setiawan";
        geri.alamat = "Mutiara bekasi jaya";

        Order handphone = new Order();

        handphone.date = 10;
        handphone.status = "Baru";

        Payment baru = new Payment();

        baru.jumlah = 15000000;
    }
}