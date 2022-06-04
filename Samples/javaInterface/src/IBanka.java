public interface IBanka {

    String hostIpAdress = "127.0.0.1";

    boolean connect(String ipAdress);

    boolean payment(double price, String cardNumber, String expireDate, String cvc);
}
