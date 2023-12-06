package collection_practice.accntr;

public class Invoice {
    static String _oldId ="0";
    protected static String formatId(String oldId){
        _oldId = oldId;
        return _oldId+"_invoice";
    }
}
class SaleInvoice extends Invoice{
    public static String formatId(String oldId){
        return _oldId+ "_SaleInvoide";
    }

    public static void main(String[] args) {
        SaleInvoice invoice = new SaleInvoice();
        System.out.println(invoice.formatId("1234"));
    }
}
