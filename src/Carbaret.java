import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carbaret {
    private ArrayList<Performer> perform;
    private String name;

    public Carbaret(String name){
        perform = new ArrayList<Performer>();
        this.name = name;
    }

    public ArrayList<Performer> getPerform(){
        return perform;
    }

    public String getName(){
        return name;
    }

    public boolean addPerformer(Performer performer){
        if (perform.indexOf(performer) == -1){
            perform.add(performer);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer performer){
        int index = perform.indexOf(performer);
    }
}
