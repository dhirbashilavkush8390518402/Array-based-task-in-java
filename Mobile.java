public class Mobile
{
 public String companyname;
 private String modelname;
 private int price;

 public Mobile(String CN, String MN, int p)
 {
  companyname = CN;
  modelname = MN;
  price = p;
 }

 public void setmodelname(String mn)
 {
  modelname = mn;
 }
  
 public String getmodelname()
 {
  return modelname;
 }
 
 public void setprice(int pr)
 {
  price = pr;
 }
  
 public int getprice()
 {
  return price;
 }

public void Display()
{
 System.out.println(modelname+"is model of"+companyname);
 System.out.println("Prise:"+price);
}
}

