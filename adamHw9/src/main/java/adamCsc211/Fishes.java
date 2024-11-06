package adamCsc211;

// main class
public class Fishes {
  // main method
  public static void main(String[] args) {
    // creating objects with types
    Fish clownfish = new smallFish("Nemo");
    Fish tigerShark = new Shark("Bill");
    // use method on objects
    clownfish.makeSound();
    tigerShark.makeSound();
  }
}

abstract class Fish {
  private String name;

  public Fish(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract void makeSound();
}

class Sound {
  private String sound;

  public Sound(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }
}

class smallFish extends Fish {

  private Sound sound;

  public smallFish(String name) {
    super(name);

    this.sound = new Sound("glub glub");
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " the clownfish said: " + sound.getSound());
  }
}

class Shark extends Fish {
  private Sound sound;

  public Shark(String name) {
    super(name);

    this.sound = new Sound("bite bite");
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " the Shark said: " + sound.getSound());
  }

}
