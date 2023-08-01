public class Contact {

    private String name;
    private String number;



    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public Contact(Contact source){
        this.name = source.name;
        this.number = source.number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String toString(){
        return "Name: "+ this.name + "\nPhone " + this.number;
        
    }

}
