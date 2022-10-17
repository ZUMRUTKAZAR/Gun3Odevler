public class Main {

    public static void main(String[] args) {
    //customerDal OracleCustomerDal'ı referans tutuyor.
    CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
    customerManager.add();
    }
}
