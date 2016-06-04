package loops;

public class Loops {
  public static void main(String[] args) {
    int i = 0;
    boolean foundIt = false;
    while (i < args.length) {
      if (args[i].startsWith("-")) {
        i++;
        continue;
      }
      if (args[i].endsWith(".scala")) {
        foundIt = true;
        break;
      }
      i++;
    }
    if (foundIt) {
      System.out.println("i = " + i);
    }
  }
}

// -fred -john James.scala -sdfadf
