package BankOfAmerica;

public class BOFAMenu {
    public static void main(String[] args) {


        Menu personal = new Menu();
        personal.setName("personal");
        personal.setID(1);
        personal.setParent(null);
        personal.setURL("https://www.bankofamerica.com/");
        personal.setSlug(null);
        personal.setLeaf(false);

    Menu smallBusiness = new Menu();
    smallBusiness.setName("Small Business");
    smallBusiness.setID(2);
    smallBusiness.setParent(null);
    smallBusiness.setURL("https://www.bankofamerica.com/smallbusiness/");
    smallBusiness.setSlug("smallbusiness");
    smallBusiness.setLeaf(false);

    Menu wealthManagement = new Menu();
    wealthManagement.setName("Wealth Management");
    wealthManagement.setID(3);
    wealthManagement.setURL("https://www.ml.com/wealthmanagement.html");
    wealthManagement.setParent(null);
    wealthManagement.setSlug(null);
    wealthManagement.setLeaf(false);

    String fetchURL = personal.getURL();
    System.out.println(fetchURL);

    }


}
