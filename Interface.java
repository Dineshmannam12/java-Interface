interface Member
{
void callback();
}
class Store{
Member mem[] =new Member[100];
int count=0;
public void register(Member m)
{
mem[count++]=m;
}
public void inviteSale()
{
for(int i=0;i<count;i++)
{
mem[i].callback();
}
}
}
class Customer implements Member{
String name;
long number;
Customer(String name,long number)
{
this.name=name;
this.number=number;
}
 public void callback(){
System.out.println("ok,you can make call" + name +" " +number);
}
}
class Client implements Member{
String name;
Client(String name){
this.name=name;
}
 public void callback()
{
System.out.println("ok,iwillcall" +name);
}
}

class Interface{
public static void main(String[] args)
{
  Store s=new Store();
  Customer c1=new Customer("dinesh",75698563);
  Client c2=new Client("yaswanth");
  s.register(c1);
  s.register(c2);
  s.inviteSale();
  
}
}

