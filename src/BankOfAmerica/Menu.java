package BankOfAmerica;


public class Menu {
    private String name;
    private long ID;
    private String parent;
    private String URL;
    private String slug;
    private boolean isLeaf;



        public void setName(String menuName){
            name= menuName;
        }

        public String getName(){
            return name;
        }

        public void setID(long numID){
           ID=numID;
        }

        public long getID(){
            return ID;
        }

        public void setParent(String parentURL){
            parent=parentURL;
        }

        public String getParent(){
            return parent;
        }

        public void setURL(String mainURL){
            URL=mainURL;
        }

        public String getURL(){
            return URL;
        }

        public void setSlug(String slugName){
            slug=slugName;
        }

        public String getSlug(){
            return slug;
        }

        public void setLeaf(boolean isItLeaf){
            isLeaf=isItLeaf;
        }

        public boolean getLeaf(){
            return isLeaf;
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
