public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void getCustomers() {
        System.out.println("Customer Getted : Oracle");
    }

    @Override
    public void add() {
        System.out.println("Customer Added : Oracle");
    }
}
