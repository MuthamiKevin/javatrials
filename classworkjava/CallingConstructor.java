class Circle
{
   private double radius, area;

   public TheCircle(double rad)
   {
      radius = rad;
   }

   public TheCircle()
   {
      radius = 0;
   }

   public void getData()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the radius of the triangle: ");
      radius = myScanner.nextDouble();
   }

   public void compute()
   {
      area = 22.0 / 7 * radius * radius;
   }

   public void giveOutput()
   {
      System.out.println("Radius of the circle = " + radius);
      System.out.println("Area = " + area);
   }
}

class Cylinder extends circle
{
   private double height, volume;
 
   public Cylinder(double rad,double hgt)
   {
      super(rad);
      height = hgt;
   }

   public void getData()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the radius of the triangle: ");
      radius = myScanner.nextDouble();
   }

   public void compute()
   {
      area = 22.0 / 7 * radius * radius;
   }

   public void giveOutput()
   {
      System.out.println("Radius of the circle = " + radius);
      System.out.println("Area = " + area);
   }