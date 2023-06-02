package BankOfAmerica;


public class Menu {
    private String name;
    private long ID;
    private String parent;
    private String URL;
    private String slug;
    private boolean isLeaf;
    public static void main(String[] args) {
        Menu personal = new Menu();
        personal.name = "Personal";
        personal.ID = 1;
        personal.parent = null;
        personal.URL="https://www.bankofamerica.com/";
        personal.slug=null;
        personal.isLeaf=false;

        Menu smallBusiness = new Menu();
        smallBusiness.name="Small Business";
        smallBusiness.ID=2;
        smallBusiness.parent=null;
        smallBusiness.URL="https://www.bankofamerica.com/smallbusiness/";
        smallBusiness.slug="smallbusiness";
        smallBusiness.isLeaf=false;

        Menu wealthManagement = new Menu();
        wealthManagement.name="Wealth Management";
        wealthManagement.ID=3;
        wealthManagement.URL="https://www.ml.com/wealthmanagement.html";
        wealthManagement.parent=null;
        wealthManagement.URL="https://www.ml.com/wealthmanagement.html";
        wealthManagement.slug=null;
        wealthManagement.isLeaf=false;

    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", parent='" + parent + '\'' +
                ", URL='" + URL + '\'' +
                ", slug='" + slug + '\'' +
                ", isLeaf=" + isLeaf +
                '}';
    }



    /*
    name:
    ID:
    parent:
    URL:
    Slug:
    Is leaf? :

     */
}
