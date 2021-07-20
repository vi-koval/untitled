import java.util.Objects;

public class Worker {
    private int id;
    private String name;
    private int age;
    private int rank;


    public Worker(int id, String name, int age, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getRank() {
        return rank;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    public void setRank() {
        this.rank = rank;
    }

    public void setId() { this.id = id; }


    public String toString() {
        return "Worker: " + name +
        " Age: " + age +
        " Rank: " + rank;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && rank == worker.rank && name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rank);
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker(1, "Ivan", 32, 11);
        Worker worker2 = new Worker(2, "Ivan", 32, 10);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker1 == worker2);
        System.out.println(worker1.equals(worker2));
        System.out.println(worker1.hashCode() == worker2.hashCode());
        System.out.println(worker1.hashCode());
        System.out.println(worker2.hashCode());
    }
}

