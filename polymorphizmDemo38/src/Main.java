public class Main {

    public static void main(String[] args) {
        //   BaseLogger[] loggers= new BaseLogger[] {new DatabaseLogger(), new EmailLogger(), new FileLogger() };
        // for (BaseLogger logger:loggers) {
        //   logger.Log("Log messajı");
        //}
        CustomerManager customeManager = new CustomerManager(new EmailLogger());
        customeManager.add();
    }
}
