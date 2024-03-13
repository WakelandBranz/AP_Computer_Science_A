class Person {
   private String name;

   public Person(String theName)
   {
      this.name = theName;
   }

   public String getName()
   {
      return name;
   }

   public boolean setName(String theNewName)
   {
      if (theNewName != null)
      {
         this.name = theNewName;
         return true;
      }
      return false;
   }
}

class Employee extends Person
{

   private static int nextId = 1;
   private int id;

   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++;
   }

   public int getId() {
      return id;
   }

   public void iterateId() {
      this.id++;
   }
}

class PersonRunner {
   public static void main(String[] args)
   {
      Employee emp = new Employee("Mark " );
      emp.iterateId();
      System.out.print(emp.getName());
      System.out.println(emp.getId());
   }
}

