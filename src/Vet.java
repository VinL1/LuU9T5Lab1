import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        clients = new ArrayList<Animal>();
        this.name = name;
    }

    public void addClient(Animal poten){
        if(clients.indexOf(poten) == -1) {
            System.out.println("Welcome to " + name + "'s office " + poten.getName() + "!");
            clients.add(poten);
        }else{
            System.out.println(poten.getName() + " is already a client of " + name);
        }
    }
}
