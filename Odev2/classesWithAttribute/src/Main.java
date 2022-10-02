public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo Laptop");
        product.setStockAmount(10);
        product.setPrice(5000);

        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
