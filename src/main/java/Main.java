import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new BackendDeveloper("Афанасий бэк");
        Developer d2 = new FrontendDeveloper("Федор фронт");
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(d1);
        developers.add(d2);
        for (Developer d : developers) {
            if (d instanceof FrontendDeveloper) {
                System.out.println(d.name + " " + ((FrontendDeveloper) d).developGUI());
            } else {
                System.out.println(d.name + " " + ((BackendDeveloper) d).developDB());
            }
        }
    }
}
