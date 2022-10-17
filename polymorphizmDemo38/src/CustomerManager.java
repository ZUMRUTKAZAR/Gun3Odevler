public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }
    public void add() {

        System.out.println("Müşteri Eklendi.");
        this.logger.log("Log mesajı");

        //DatabaseLogger logger = new DatabaseLogger();-> bu sistemde newleyerek kullanım pek sağlıklı değil
        //logger.Log("Log mesajı");                       herhangi bir değişim yapmak istediğimiz zaman sıkıntı yaşarız.
    }
}
