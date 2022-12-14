package task5;


public class Animal {
    String name = "Васька";
    int age = 45;
    boolean c = false  ;
      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && c == animal.c && name.equals(animal.name) ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (c ? 1 : 0);
        result = prime * result + age ;
        result = prime * result + ((name == null ) ? 0 : name.hashCode() );
        return result ;
    }
    @Override
    public  String toString() {
        String t;
        if (!c)
            t = "нi";
        else
            t = "так";
        return String.format("Ім'я: %s, вік: %d, хвіст: %s", name,age, t );
    }
}
