public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Customer Added : Mysql");
    }

    @Override
    public void getCustomers() {
        System.out.println("Customer Getted : Mysql");
    }
}
