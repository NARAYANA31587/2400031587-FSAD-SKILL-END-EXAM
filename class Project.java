class Project {
    private static int counter = 1;
    private int id;
    private String name;
    private String description;
    private String date;
    private String status;
    private int cost;
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
}
public class Main {
    public static void main(String[] args) {
        Project p = new Project();
        p.setName("PRODUCT");
        p.setDescription("Java class");
        p.setDate("2026-05-02");
        p.setStatus("Done");
        p.setCost(5000);
        Project p1 = p;

        System.out.println(p1.getName() + " " + p1.getDate()+ " "+p1.getStatus());
    }
}